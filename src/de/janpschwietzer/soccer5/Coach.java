package de.janpschwietzer.soccer5;

public class Coach extends Person {
    private int experience;

    public Coach(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return this.experience;
    }

    @Override
    public String toString() {
        return "\nCoach\n" + "name: " + this.name + "\nage: " + this.age + "\nexperience: " + this.experience;
    }
}
