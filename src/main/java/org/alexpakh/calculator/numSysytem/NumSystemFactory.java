package org.alexpakh.calculator.numSysytem;

public class NumSystemFactory {
    public NumSystem createNumSystem(NumeralSystemType numeralSystemType) {
        NumSystem numSystem = null;
        switch (numeralSystemType) {
            case BIN:
                numSystem = new Bin();
                break;
            case OCT:
                numSystem = new Oct();
                break;
            case DEC:
                numSystem = new Dec();
                break;
            case HEX:
                numSystem = new Hex();
                break;

        }
        return numSystem;
    }
}
