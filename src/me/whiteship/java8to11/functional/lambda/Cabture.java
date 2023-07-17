package me.whiteship.java8to11.functional.lambda;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Cabture {
    public static void main(String[] args) {
        Cabture cabture = new Cabture();
        cabture.run();
    }

    private void run() {
        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber(){
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> innerClass = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer intConsumer = i-> System.out.println(i+baseNumber);

        intConsumer.accept(10);
    }
}
