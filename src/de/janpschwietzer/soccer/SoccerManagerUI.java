package de.janpschwietzer.soccer;

public class SoccerManagerUI {
    public static void main(String[] args) {

        Coach steffen = new Coach("Steffen", 27, 5);
        Player jan = new Player("Jan", 24, 6, 8, 9, 3);

        System.out.println(steffen.toString());
        System.out.println(jan.toString());

        for (int i = 0; i < 10; i++) {
            System.out.println(jan.ShootAtGoal());
        }
    }
}
