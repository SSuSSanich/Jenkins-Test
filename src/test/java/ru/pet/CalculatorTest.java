package ru.pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-2, calculator.subtract(-1, 1));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-2.0, calculator.divide(-4, 2));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
