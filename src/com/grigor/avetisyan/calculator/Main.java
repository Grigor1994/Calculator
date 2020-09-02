package com.grigor.avetisyan.calculator;

import com.grigor.avetisyan.calculator.util.Parser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        String firstOperand = inputArray[0];
        String secondOperand = inputArray[2];
        String operator = inputArray[1];

        ArabicCalculator arabicCalculator = new ArabicCalculator();
        RomanCalculator romanCalculator = new RomanCalculator(arabicCalculator);

        boolean checker = false;
        if (Parser.checkType(firstOperand, secondOperand)) {
            checker =true;
        }

        switch (operator) {
            case "+" -> {
                if (checker) {
                    System.out.println("Output: \n" + arabicCalculator.plus(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand)));
                } else {
                    System.out.println("Output: \n" + romanCalculator.plus(firstOperand, secondOperand));
                }
            }
            case "-" -> {
                if (checker) {
                    System.out.println("Output: \n" + arabicCalculator.minus(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand)));
                } else {
                    System.out.println("Output: \n" + romanCalculator.minus(firstOperand, secondOperand));
                }
            }
            case "*" -> {
                if (checker) {
                    System.out.println("Output: \n" + arabicCalculator.multiply(Integer.parseInt(firstOperand), Integer.parseInt(secondOperand)));
                } else {
                    System.out.println("Output: \n" + romanCalculator.multiply(firstOperand, secondOperand));
                }
            }
            case "/" -> {
                if (checker) {
                    System.out.println("Output: \n" + arabicCalculator.division(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[2])));
                } else {
                    System.out.println("Output: \n" + romanCalculator.division(firstOperand, secondOperand));
                }
            }
            default -> {
                throw new IllegalArgumentException("`" + operator + "`" + " is not mathematical operator.");
            }
        }
    }
}
