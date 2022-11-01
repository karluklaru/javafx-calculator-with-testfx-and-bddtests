package com.example.calculatora;

public class MyCalculator implements Calculator {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        if (Math.abs(b) <= Math.pow(10, -8)) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return a/b;
    }
}
