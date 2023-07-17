package me.whiteship.java8to11.functional;

public class Foo {

    public static void main(String[] args) {
        // 익명 내부클래스
        /*
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doit() {
                System.out.println("hello");
            }
        };*/
        /*
        RunSomething runSomething = (number) -> System.out.println(number+10);
        runSomething.doit(1);
        runSomething.doit(1);
        runSomething.doit(1);
         */
        /*
        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10;
            @Override
            public int doit(int number) {
                baseNumber++;
                return number + baseNumber;
            }
        };

        System.out.println(runSomething.doit(1));
        System.out.println(runSomething.doit(1));
        System.out.println(runSomething.doit(1));
         */
        final int baseNumber = 10;
        RunSomething runSomething = number -> number + baseNumber;
    }
}
