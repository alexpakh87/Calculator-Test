package org.alexpakh.calculator.operation;

import org.alexpakh.Calculator;

class Subtraction implements Operation {
    @Override
    public int operation(int a, int b) {
        return a - b;
    }

    private int subtractionPrivate(int a, int b) {
        return a-b;
    }
}
