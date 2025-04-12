package ru.pet;


import org.slf4j.Logger;

//не сможешь запушить дев
public class Calculator {

    private final Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public int add(int a, int b) {
        logger.debug("addition result: {}", a + b);
        return a + b;
    }

    public int subtract(int a, int b) {
        logger.debug("subtraction result: {}", a - b);
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}
