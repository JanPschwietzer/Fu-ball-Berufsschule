package de.janpschwietzer.soccer5;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "";
    }
}
