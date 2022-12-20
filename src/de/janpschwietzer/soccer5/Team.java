package de.janpschwietzer.soccer5;

import java.util.ArrayList;

public class Team {
    private String name;
    private Coach coach;
    private Goalkeeper goalkeeper;
    private ArrayList<Player> squad;

    public Team(String name, Coach coach, Goalkeeper goalkeeper) {
        this.name = name;
        this.coach = coach;
        this.goalkeeper = goalkeeper;
        this.squad=new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        this.squad.add(player);
    }

    public int getTotalMotivation() {
        int absolute = 0;
        int count = 1;

        for (Player player : this.squad) {
            absolute += player.getMotivation();
            count++;
        }
        absolute += goalkeeper.getMotivation();

        return absolute / count;
    }

    public int getTotalForce() {
        int absolute = 0;
        int count = 0;

        for (Player player : this.squad) {
            if (count <= 10) {
                absolute += player.getMotivation();
            }
            count++;
        }
        absolute += goalkeeper.getMotivation();

        return absolute / 11;
    }

    public String getName() {
        return this.name;
    }

    public Coach getCoach() {
        return this.coach;
    }
    public String toString() {
        String ret =    "***Mannschaft***\n" +
                        "Trainer: " + coach.getName() + "\n" +
                        "Torhüter: " + goalkeeper.getName() + "\n";
        for (Player player : squad) ret += "Spieler: " + player.getName() + "\n";

        return ret;
    }
}
