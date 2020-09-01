package com.grigor.avetisyan.calculator;

import com.grigor.avetisyan.calculator.util.Parser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        ArabicCalculator arabicCalculator = new ArabicCalculator();
        RomanCalculator romanCalculator = new RomanCalculator(arabicCalculator);
        switch (inputArray[1]) {
            case "+" -> {
                if (Parser.checkType(inputArray[0], inputArray[2])) {
                    System.out.println("Output: \n" + romanCalculator.plus(inputArray[0], inputArray[2]));
                } else {
                    System.out.println("Output: \n" + arabicCalculator.plus(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[2])));
                }
            }
            case "-" -> {
                if (Parser.checkType(inputArray[0], inputArray[2])) {
                    System.out.println("Output: \n" + romanCalculator.minus(inputArray[0], inputArray[2]));
                } else {
                    System.out.println("Output: \n" + arabicCalculator.minus(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[2])));
                }
            }
            case "*" -> {
                if (Parser.checkType(inputArray[0], inputArray[2])) {
                    System.out.println("Output: \n" + romanCalculator.multiply(inputArray[0], inputArray[2]));
                } else {
                    System.out.println("Output: \n" + arabicCalculator.multiply(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[2])));
                }
            }
            case "/" -> {
                if (Parser.checkType(inputArray[0], inputArray[2])) {
                    System.out.println("Output: \n" + romanCalculator.division(inputArray[0], inputArray[2]));
                } else {
                    System.out.println("Output: \n" + arabicCalculator.division(Integer.parseInt(inputArray[0]), Integer.parseInt(inputArray[2])));
                }
            }
        }
    }
}
