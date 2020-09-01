package com.grigor.avetisyan.calculator.util;

import java.util.Set;

public class Parser {
    private static final Set<String> romanos = Set.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

    public static boolean checkType(String a, String b) {
        return romanos.contains(String.valueOf(a)) || romanos.contains(String.valueOf(b));
    }
}
