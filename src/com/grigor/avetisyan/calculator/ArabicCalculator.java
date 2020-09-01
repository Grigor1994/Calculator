package com.grigor.avetisyan.calculator;

public class ArabicCalculator implements Calculator {
    @Override
    public String plus(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x > 10 || y > 10) throw new IllegalArgumentException(x + " or " + y + " must be equal or less than 10.");
        return String.valueOf(x + y);
    }

    @Override
    public String minus(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x > 10 || y > 10) throw new IllegalArgumentException(x + " or " + y + " must be equal or less than 10.");
        return String.valueOf(x - y);
    }

    @Override
    public String multiply(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x > 10 || y > 10) throw new IllegalArgumentException(x + " or " + y + " must be equal or less than 10.");
        return String.valueOf(x * y);
    }

    @Override
    public String division(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (x > 10 || y > 10) throw new IllegalArgumentException(x + " or " + y + " must be equal or less than 10.");
        return String.valueOf(x / y);
    }
}
