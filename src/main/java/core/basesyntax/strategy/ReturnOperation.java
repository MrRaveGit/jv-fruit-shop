package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class ReturnOperation implements OperationHandler {

    @Override
    public void apply(FruitTransaction transaction) {
        int currentQuantity = Storage.fruits.getOrDefault(transaction.getFruit(), 0);
        Storage.fruits.put(transaction.getFruit(), transaction.getQuantity() + currentQuantity);
    }
}
