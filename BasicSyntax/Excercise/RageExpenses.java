package BasicSyntax.Excercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gamesLost=Integer.parseInt(sc.nextLine());
        double headsetPrice=Double.parseDouble(sc.nextLine());
        double mousePrice=Double.parseDouble(sc.nextLine());
        double keyboardPrice=Double.parseDouble(sc.nextLine());
        double displayPrice=Double.parseDouble(sc.nextLine());
        double totalCost=0;

        int headsetCrush=gamesLost/2;
        int mouseCrush=gamesLost/3;
        int keyboardCrush=gamesLost/6;
        int displayCrush=gamesLost/12;
        totalCost=headsetCrush*headsetPrice+mouseCrush*mousePrice+keyboardCrush*keyboardPrice+displayCrush*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",totalCost);
    }
}
