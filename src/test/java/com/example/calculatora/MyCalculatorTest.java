package com.example.calculatora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    private MyCalculator myCalculator;

    @BeforeEach
    void setUp() {
        myCalculator = new MyCalculator();
    }

    @Test
    void sumPositive() {
        assertEquals(4.0, myCalculator.sum(2.0, 2.0));
    }

    @Test
    void sumPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, myCalculator.sum(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void sumMaxPlusMin() {
        assertEquals(Double.MAX_VALUE, myCalculator.sum(Double.MAX_VALUE, Double.MIN_VALUE));
    }

    @Test
    void sumMinPlusMax() {
        assertEquals(Double.MAX_VALUE, myCalculator.sum(Double.MIN_VALUE, Double.MAX_VALUE));
    }

    @Test
    void sumMinTwice() {
        assertEquals(2 * Double.MIN_VALUE, myCalculator.sum(Double.MIN_VALUE, Double.MIN_VALUE));
    }

    @Test
    void subtractPositive() {
        assertEquals(0.0, myCalculator.subtract(2.0, 2.0));
    }

    @Test
    void subtractMaxSubMax() {
        assertEquals(0.0, myCalculator.subtract(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void subtractMaxSubMin() {
        assertEquals(Double.MAX_VALUE, myCalculator.subtract(Double.MAX_VALUE, Double.MIN_VALUE));
    }

    @Test
    void subtractMinSubMax() {
        assertEquals(Double.MIN_VALUE - Double.MAX_VALUE, myCalculator.subtract(Double.MIN_VALUE, Double.MAX_VALUE));
    }

    @Test
    void subtractMinSubMin() {
        assertEquals(0.0, myCalculator.subtract(Double.MIN_VALUE, Double.MIN_VALUE));
    }

    @Test
    void multiplyPositive() {
        assertEquals(4.0, myCalculator.multiply(2.0, 2.0));
    }

    @Test
    void multiplyMaxMulMax() {
        assertEquals(Double.POSITIVE_INFINITY, myCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void multiplyMaxMulMin() {
        assertEquals(Double.MAX_VALUE*Double.MIN_VALUE, myCalculator.multiply(Double.MAX_VALUE, Double.MIN_VALUE));
    }

    @Test
    void multiplyMinMulMax() {
        assertEquals(Double.MIN_VALUE*Double.MAX_VALUE, myCalculator.multiply(Double.MIN_VALUE, Double.MAX_VALUE));
    }

    @Test
    void multiplyMinMulMin() {
        assertEquals(Double.MIN_VALUE * Double.MIN_VALUE, myCalculator.multiply(Double.MIN_VALUE, Double.MIN_VALUE));
    }

    @Test
    void dividePositive() {
        assertEquals(1.0, myCalculator.divide(2.0, 2.0));
    }

    @Test
    void divideMaxDivMax() {
        assertEquals(Double.MAX_VALUE / Double.MAX_VALUE, myCalculator.divide(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void divideMinDivMin() {
        try {
            assertEquals(Double.MIN_VALUE / Double.MIN_VALUE, myCalculator.divide(Double.MIN_VALUE, Double.MIN_VALUE));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void dividePositiveByZero() {
        try {
            assertEquals(Double.POSITIVE_INFINITY, myCalculator.divide(1.0, 0.0));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void divideNegativeByZero() {
        try {
            assertEquals(Double.NEGATIVE_INFINITY, myCalculator.divide(-1.0, 0.0));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}