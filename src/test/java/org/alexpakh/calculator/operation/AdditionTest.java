package org.alexpakh.calculator.operation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    Operation addition;

    @BeforeEach
    void prepareObject() {
        addition = new Addition();
    }

    @ParameterizedTest
    @DisplayName("Demo load data from file")
    @CsvFileSource(resources =
            "test-data.csv",
            delimiter = ',',
            numLinesToSkip = 2)
    void operation(int a, int b, int result) throws Exception {
        assertEquals(result, addition.operation(a, b));
    }
}