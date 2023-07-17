package me.whiteship.java8to11;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Supplier<Greeting> newGreeting = Greeting::new;
    }
}
