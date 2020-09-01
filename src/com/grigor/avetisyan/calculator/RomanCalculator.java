package com.grigor.avetisyan.calculator;

import com.grigor.avetisyan.calculator.util.ConvertHelper;

public class RomanCalculator implements Calculator<String> {
    private final ArabicCalculator arabicCalculator;

    public RomanCalculator(ArabicCalculator arabicCalculator) {
        this.arabicCalculator = arabicCalculator;
    }

    @Override
    public String plus(String a, String b) {
        return ConvertHelper.arabicToRoman(arabicCalculator.plus(ConvertHelper.romanToArabic(a), ConvertHelper.romanToArabic(b)));
    }

    @Override
    public String minus(String a, String b) {
        return ConvertHelper.arabicToRoman(arabicCalculator.minus(ConvertHelper.romanToArabic(a), ConvertHelper.romanToArabic(b)));
    }

    @Override
    public String multiply(String a, String b) {
        return ConvertHelper.arabicToRoman(arabicCalculator.multiply(ConvertHelper.romanToArabic(a), ConvertHelper.romanToArabic(b)));
    }

    @Override
    public String division(String a, String b) {
        return ConvertHelper.arabicToRoman(arabicCalculator.division(ConvertHelper.romanToArabic(a), ConvertHelper.romanToArabic(b)));
    }
}
