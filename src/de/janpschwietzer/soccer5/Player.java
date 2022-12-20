package de.janpschwietzer.soccer5;

public class Player extends Person {
    protected int strength;
    protected int powerAtGoalKick;
    protected int motivation;
    protected int numberOfGoals;

    public Player(String name, int age, int strength, int powerAtGoalKick, int motivation, int numberOfGoals) {
        super(name, age);
        this.strength = strength;
        this.powerAtGoalKick = powerAtGoalKick;
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
    }

    public int ShootAtGoal() {
        return validate((int) (this.powerAtGoalKick - 2 + (Math.random() * 4)));
    }

    @Override
    public String toString() {
        return  "\nPlayer\n" + "name: " + this.name +
                "\nage: " + this.age +
                "\nstrength: " + this.strength +
                "\npowerAtGoalKick: " + this.powerAtGoalKick +
                "\nmotivation: " + this.motivation +
                "\nnumOfGoals: " + this.numberOfGoals;
    }

    public int getMotivation(){
        return this.motivation;
    }

    public void addGoal() {
        this.numberOfGoals += 1;
    }

    protected int validate(int kickStrength) {

        if (kickStrength >= 1 && kickStrength <= 10) return kickStrength;
        else if (kickStrength < 1) return 1;
        else return 10;
    }
}
