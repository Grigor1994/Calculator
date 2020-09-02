package com.grigor.avetisyan.calculator.util;


public class Parser {

    public static boolean checkType(String firstOperand, String secondOperand) {
        // null or empty
        if (firstOperand == null || firstOperand.length() == 0 && secondOperand == null || secondOperand.length() == 0) {
            return false;
        }
        return firstOperand.chars().allMatch(Character::isDigit) && secondOperand.chars().allMatch(Character::isDigit);
    }
}
