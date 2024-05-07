package org.alexpakh.calculator.operation;

public class OperationTypeFactory {
    public Operation createOperation(OperationType operationType) {
        Operation operation = null;
        switch (operationType) {
            case ADDITION:
                operation = new Addition();
                break;
            case SUBTRACTION:
                operation = new Subtraction();
                break;
            case MULTIPLICATION:
                operation = new Multiplication();
                break;
            case DIVISION:
                operation = new Division();
                break;
        }
        return operation;
    }
}
