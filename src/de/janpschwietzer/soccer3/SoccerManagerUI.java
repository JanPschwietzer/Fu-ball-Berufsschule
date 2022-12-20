package de.janpschwietzer.soccer3;

public class SoccerManagerUI {
    public static void main(String[] args) {

        Coach steffen = new Coach("Steffen", 27, 5);
        Player jan = new Player("Jan", 24, 6, 8, 9, 3);
        Goalkeeper simon = new Goalkeeper("Simon", 22, 6, 8, 3, 0, 5);

        System.out.println(steffen.toString());
        System.out.println(jan.toString());

        for (int i = 0; i < 10; i++) {
            int jsg = jan.ShootAtGoal();
            System.out.println(simon.ballHold(jsg) + " " + jsg);
        }
    }
}
