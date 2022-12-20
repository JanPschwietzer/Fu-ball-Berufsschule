package de.janpschwietzer.soccer4;

public class Goalkeeper extends Player {
    private int reaction;

    public Goalkeeper(String name, int age, int strength, int powerAtGoalKick, int motivation, int numberOfGoals, int reaction) {
        super(name, age, strength, powerAtGoalKick, motivation, 0);
        this.reaction = reaction;
    }

    public boolean ballHold(int powerAtGoalKick) {
        return validate((int) (this.reaction - 2 + (Math.random() * 4))) >= powerAtGoalKick;
    }

    @Override
    public String toString() {

        return "";
    }

}
