package org.alexpakh.calculator.operation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
    Operation operation;

    @BeforeEach
    void prepareObject() {
        operation = new Multiplication();
    }


    @ParameterizedTest
//    @EmptySource// передать пустое значение
//    @NullSource// передать Null
//    @ValueSource(ints = {2, 4, 5, 5})//можно передавать аргумент в метод только с одним параметром

    @CsvSource({"2,3,6",
            "4,5,20",

    })
    void operationTest(int a, int b, int result) throws Exception {

        assertEquals(result, operation.operation(a, b));

    }




}