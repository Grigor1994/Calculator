package com.grigor.avetisyan.calculator;

public interface Calculator<T> {
    T plus(T a, T b);

    T minus(T a, T b);

    T multiply(T a, T b);

    T division(T a, T b);
}
