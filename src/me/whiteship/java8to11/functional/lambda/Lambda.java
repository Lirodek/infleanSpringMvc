package me.whiteship.java8to11.functional.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> 10;
        BinaryOperator<Integer> sum = (a,b) -> a+b;
    }
}
