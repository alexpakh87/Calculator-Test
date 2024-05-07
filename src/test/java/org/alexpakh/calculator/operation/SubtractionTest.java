package org.alexpakh.calculator.operation;

import org.alexpakh.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {
    Subtraction subtraction;

    @BeforeEach
    void setUp() {
        subtraction = new Subtraction();
    }

    @ParameterizedTest
    @CsvSource({
            "4,2,2",
            "17,14,3",
            "33,22,1"
    })
    void operation(int a, int b, int result) {
        assertEquals(result, subtraction.operation(a, b));
    }

    @ParameterizedTest
   // @DisplayName("reflection")
    @CsvSource({
            "4,2,2",
            "17,14,3",
            "33,22,11"
    })
    void privateMethod(int a, int b, int result) throws InvocationTargetException,
            IllegalAccessException {
        try {
            Method method = Subtraction.class.getDeclaredMethod("subtractionPrivate",
                    Integer.TYPE, Integer.TYPE);
            method.setAccessible(true);
            assertEquals(result, method.invoke(subtraction, a, b));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        
    }
}