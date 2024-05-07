package org.alexpakh.calculator.operation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    Operation division;

    @BeforeEach
    void prepareObject() {
        division = new Division();
    }

    @ParameterizedTest
    @CsvSource({"12,3,4",
            "4,0,20",
            "5,5,1"
    })
    void operationDivision(int a, int b, int result) throws Exception {

        assertEquals(result, division.operation(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "4,0,20",
    })
    void operationDivisionByZero(int a, int b, int result) {

         assertThrows(Exception.class, () -> division.operation(a, b));
    }
}