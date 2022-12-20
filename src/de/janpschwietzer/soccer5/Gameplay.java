package de.janpschwietzer.soccer5;

import java.util.Random;

public class Gameplay {
    private static final int PLAYING_TIME = 90;
    private static final int MAX_ADDITIONAL_TIME=5;
    private static final int MAX_DURATION_UNTIL_NEXT_ACTION = 15;

    private Game game;

    public Gameplay(Game game) {
        this.game = game;
    }

    public int calculateForceOfTheTeam(Team team) {
        Random random = new Random();
        int someInt = random.nextInt(7) - 3;
        int ret = (team.getTotalForce() + team.getTotalMotivation()) * team.getCoach().getExperience() + someInt;

        return Math.max(ret, 1);
    }
}
