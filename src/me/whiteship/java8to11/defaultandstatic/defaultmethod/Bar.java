package me.whiteship.java8to11.defaultandstatic.defaultmethod;

public interface Bar extends Foo{
    default void printNameUpperCase(){
        System.out.println("Bar");
    }
}
