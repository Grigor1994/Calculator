package com.grigor.avetisyan.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");
        checkArrayLength(inputArray);

        String firstOperand = inputArray[0];
        String secondOperand = inputArray[2];
        String operator = inputArray[1];

        ArabicCalculator arabicCalculator = new ArabicCalculator();
        RomanCalculator romanCalculator = new RomanCalculator(arabicCalculator);

        Object result;

        boolean isNumeric = false;
        if (isNumeric(firstOperand, secondOperand)) {
            isNumeric = true;
        }

        switch (operator) {
            case "+" -> {
                if (isNumeric) {
                    result = arabicCalculator.plus(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand));
                } else {
                    result = romanCalculator.plus(firstOperand, secondOperand);
                }
            }
            case "-" -> {
                if (isNumeric) {
                    result = arabicCalculator.minus(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand));
                } else {
                    result = romanCalculator.minus(firstOperand, secondOperand);
                }
            }
            case "*" -> {
                if (isNumeric) {
                    result = arabicCalculator.multiply(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand))
                    ;
                } else {
                    result = romanCalculator.multiply(firstOperand, secondOperand);
                }
            }
            case "/" -> {
                if (isNumeric) {
                    result = arabicCalculator.division(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand));
                } else {
                    result = romanCalculator.division(firstOperand, secondOperand);
                }
            }
            default -> throw new IllegalArgumentException("`" + operator + "`" + " is not mathematical operator.");
        }
        System.out.println("Output: \n" + result);
    }

    static boolean isNumeric(String firstOperand, String secondOperand) {
        // null or empty
        if (firstOperand == null || firstOperand.length() == 0 && secondOperand == null || secondOperand.length() == 0) {
            return false;
        }
        return firstOperand.chars().allMatch(Character::isDigit) && secondOperand.chars().allMatch(Character::isDigit);
    }

    static void checkArrayLength(String[] inputArray) {
        if (inputArray.length > 3) throw new ArrayIndexOutOfBoundsException();
    }
}
