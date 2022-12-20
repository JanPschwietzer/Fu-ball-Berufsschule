package de.janpschwietzer.soccer5;

public class Game {

    private Team home;
    private Team away;
    private int goalsHome;
    private int goalsAway;

    public Game(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    public void incHomeGoals() {
        this.goalsHome++;
    }

    public void incAwayGoals() {
        this.goalsAway++;
    }

    public String getScore() {

        return this.home.getName() + ": " + this.goalsHome + " - " + this.away.getName() + ": " + this.goalsAway;
    }

    @Override
    public String toString() {
        return this.home.getName() + " - " + this.away.getName();
    }

}
