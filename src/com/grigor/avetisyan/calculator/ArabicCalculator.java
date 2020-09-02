package com.grigor.avetisyan.calculator;

public class ArabicCalculator implements Calculator<Integer> {
    @Override
    public Integer plus(Integer a, Integer b) {
        if (a > 10 || b > 10) throw new IllegalArgumentException(a + " or " + b + " must be equal or less than 10.");
        return a + b;
    }

    @Override
    public Integer minus(Integer a, Integer b) {
        if (a > 10 || b > 10) throw new IllegalArgumentException(a + " or " + b + " must be equal or less than 10.");
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        if (a > 10 || b > 10) throw new IllegalArgumentException(a + " or " + b + " must be equal or less than 10.");
        return a * b;
    }

    @Override
    public Integer division(Integer a, Integer b) {
        if (a > 10 || b > 10) throw new IllegalArgumentException(a + " or " + b + " must be equal or less than 10.");
        return a / b;
    }

}
