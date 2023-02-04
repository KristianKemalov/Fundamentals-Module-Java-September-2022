package MidExam;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        int roomsSucceeded = 0;
        String[] dungeons = sc.nextLine().split("\\|");


        for (int i = 0; i < dungeons.length; i++) {
            String[] currentRoom = dungeons[i].split(" ");
            if (currentRoom[0].equals("potion")) {
                int healedPoints = Integer.parseInt(currentRoom[1]);
                int healthTo100 = 100 - health;
                if (healedPoints > healthTo100) {
                    System.out.printf("You healed for %d hp.%n", healthTo100);
                    health = 100;
                    System.out.println("Current health: 100 hp.");
                } else {
                    System.out.printf("You healed for %d hp.%n", healedPoints);
                    health += healedPoints;
                    System.out.printf("Current health: %d hp.%n", health);
                }


            } else if (currentRoom[0].equals("chest")) {
                int currentBitcoins = Integer.parseInt(currentRoom[1]);
                System.out.printf("You found %d bitcoins.%n", currentBitcoins);
                bitcoins += currentBitcoins;
            } else {
                int monsterAttack = Integer.parseInt(currentRoom[1]);
                String monster = currentRoom[0];
                health -= monsterAttack;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", monster);
                } else {
                    System.out.printf("You died! Killed by %s.%n", monster);
                    System.out.printf("Best room: %d", i + 1);
                    break;
                }
            }
            roomsSucceeded++;
        }


        if (roomsSucceeded == dungeons.length) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
