package com.grigor.avetisyan.calculator;

import com.grigor.avetisyan.calculator.util.ConvertHelper;

public class RomanCalculator implements Calculator {
    @Override
    public String plus(String a, String b) {
        int x = ConvertHelper.romanToArabic(a);
        int y = ConvertHelper.romanToArabic(b);
        int sum = x + y;
        return ConvertHelper.arabicToRoman(sum);
    }

    @Override
    public String minus(String a, String b) {
        int x = ConvertHelper.romanToArabic(a);
        int y = ConvertHelper.romanToArabic(b);
        int difference = x - y;
        return ConvertHelper.arabicToRoman(difference);
    }

    @Override
    public String multiply(String a, String b) {
        int x = ConvertHelper.romanToArabic(a);
        int y = ConvertHelper.romanToArabic(b);
        int produce = x * y;
        return ConvertHelper.arabicToRoman(produce);
    }

    @Override
    public String division(String a, String b) {
        int x=ConvertHelper.romanToArabic(a);
        int y=ConvertHelper.romanToArabic(b);
        int quotient=x/y;
        return ConvertHelper.arabicToRoman(quotient);
    }
}
