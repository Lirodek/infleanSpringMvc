package me.whiteship.java8to11.functional.methodrefference;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        UnaryOperator<String> hi = Greeting::hi;

        /*Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting = newGreeting.get();*/

        Greeting greeting = new Greeting();
        UnaryOperator<String> unaryGreeting = greeting::hello;
        System.out.println(unaryGreeting.apply("배광민"));

    }
}
