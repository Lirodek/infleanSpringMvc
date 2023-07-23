package me.whiteship.java8to11.defaultandstatic.defaultmethod;

public class App {
    public static void main(String[] args) {
        Foo foo = new DefaultMethod("Gwangmin");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();


    }
}
