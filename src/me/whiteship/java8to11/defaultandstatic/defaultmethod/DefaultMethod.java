package me.whiteship.java8to11.defaultandstatic.defaultmethod;

public class DefaultMethod implements Foo {

    String name;

    public DefaultMethod(String name) {
        this.name = name;
    }

    @Override
    public void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
