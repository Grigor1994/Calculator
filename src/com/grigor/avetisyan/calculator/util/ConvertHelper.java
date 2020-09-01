package com.grigor.avetisyan.calculator.util;

public class ConvertHelper {

    private static final String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String arabicToRoman(int value) {
        if (value > 3999 || value < 1) throw new IllegalArgumentException(value + " is not in range (0,4000]");

        StringBuilder numeral = new StringBuilder();
        int count = 0;

        while (value > 0) {
            if (value - values[count] >= 0) {
                numeral.append(numerals[count]);
                value -= values[count];
            }
            else {
                count++;
            }
        }
        return numeral.toString();
    }

    public static int romanToArabic(String input) {
        String romanDigit = input.toUpperCase();

        int result = 0;
        int count = 0;

        while ((romanDigit.length() > 0) && (count < numerals.length)) {
            String symbol = numerals[count];
            if (romanDigit.startsWith(symbol)) {
                result += values[count];
                romanDigit = romanDigit.substring(symbol.length());
            } else {
                count++;
            }
        }

        if (romanDigit.length() > 0)
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");

        return result;
    }
}
