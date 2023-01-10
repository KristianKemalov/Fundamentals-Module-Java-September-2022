package MidExam;

import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amountOfExp = Double.parseDouble(sc.nextLine());
        int countBattles = Integer.parseInt(sc.nextLine());
        double expGained = 0;
        int counter=0;

        for (int i = 1; i <= countBattles; i++) {
            int currentBattleExp = Integer.parseInt(sc.nextLine());

            if (i % 3 == 0) {
                expGained = expGained + currentBattleExp * 1.15;

            } else if (i % 5 == 0) {
                expGained = expGained + currentBattleExp * 0.9;
            } else if (i % 15 == 0) {
                expGained = expGained + currentBattleExp * 1.05;
            } else {
                expGained += currentBattleExp;
            }
            if (expGained >= amountOfExp) {
                break;
            }
            counter++;
        }
        if (expGained>=amountOfExp){
            System.out.printf("Player successfully collected his needed experience for %d battles.",counter+1);
        }else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",amountOfExp-expGained);
        }
    }
}
