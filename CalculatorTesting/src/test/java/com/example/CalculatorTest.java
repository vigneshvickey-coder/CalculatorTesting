
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calculator.subtract(15, 10));
    }

    @Test
    void testMultiplication() {
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    void testDivision() {
        assertEquals(5.0, calculator.divide(20, 4));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
    }

}