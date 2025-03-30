package com.example.spring_app.controllers;

import org.junit.jupiter.api.Test;

import com.example.spring_app.controllers.CalculatorController;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    CalculatorController calculatorController = new CalculatorController();

    @Test
    void testAddition() {
        double result = calculatorController.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testSubtraction() {
        double result = calculatorController.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiplication() {
        double result = calculatorController.multiply(6, 7);
        assertEquals(42, result);
    }

    @Test
    void testDivision() {
        double result = calculatorController.divide(20, 4);
        assertEquals(5, result);
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatorController.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
