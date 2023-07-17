package me.whiteship.java8to11.functional.forjava;

import java.util.function.*;

public class Foo {
    static int testInteger = 1;

    public static void main(String[] args) {
        /*Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus10 = (number)->10+number;
        System.out.println(plus10.apply(1));

        Function<Integer, Integer> plus10 = (number)->10+number;
        Function<Integer, Integer> multiply2 = (number) -> number * 2;
        Function<Integer, Integer> multiply2Plus10 = plus10.compose(multiply2);
        // 고차함수 함수를 입력받아서 함수를 리턴해줄 수 있다.
        System.out.println(multiply2Plus10.apply(10));

        Function<Integer, Integer> plus10Multiply2 = plus10.andThen(multiply2);
        System.out.println(plus10Multiply2.apply(10));

        Consumer<Integer> printT = (i) -> System.out.println("1번함수 :: " + i);
        Consumer<Integer> printK = (i) -> System.out.println("2번함수 :: " + i);
        Consumer<Integer> integerConsumer = printT.andThen(printK);
        integerConsumer.accept(10);

        Supplier<Integer> get10 = ()->10;
        System.out.println(get10.get());

        Predicate<String> predicateBae = str -> str.startsWith("배");
        Predicate<String> predicateLee = str -> str.startsWith("이");
        Predicate<String> predicateLeeAndBae = predicateLee.or(predicateBae);
        System.out.println(predicateLeeAndBae.test("이영섭"));
        System.out.println(predicateLeeAndBae.test("배광민"));

        Predicate<Integer> predicateEven = i -> i%2==0;
        Predicate<Integer> drainageFive =  i -> i%5==0;
        Predicate<Integer> evenAndFive = predicateEven.and(drainageFive);
        System.out.println(evenAndFive.test(5));
        System.out.println(evenAndFive.test(10));

        UnaryOperator<Integer> plus10 = (number)->10+number;
        UnaryOperator<Integer> multiply2 = (number) -> number * 2;
        Function<Integer, Integer> compose = plus10.compose(multiply2);
        // 고차함수 함수를 입력받아서 함수를 리턴해줄 수 있다.
        System.out.println(compose.apply(10));
        */
        /*
        BiFunction<Integer, Integer, Integer> biFunction = (number1,number2)-> number1 + number2;
        System.out.println(biFunction.apply(10, 20));

        BinaryOperator<Integer> binaryOperator = (number1, number2) -> number1 + number2;
        System.out.println(binaryOperator.apply(10, 20));*/
        TestClass testClass = new TestClass(4);
    }
}
