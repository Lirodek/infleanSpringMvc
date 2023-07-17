package me.whiteship.java8to11;

public class Greeting {
    private String name;

    public Greeting(){

    }

    public String hello(String name){
        return "hello "+name;
    }

    public static String hi(String name){
        return "hi "+name;
    }
}
