package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class PurchaseOperation implements OperationHandler {
    @Override
    public void apply(FruitTransaction transaction) {
        int currentQuantity = Storage.getFruits().getOrDefault(transaction.getFruit(), 0);
        Storage.getFruits()
                .put(transaction.getFruit(), currentQuantity - transaction.getQuantity());
    }
}
