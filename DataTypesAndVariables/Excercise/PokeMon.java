package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int power = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());
        int counterOfSuccess = 0;
        int firstPower = power;
        while (power >= distance) {
            power -= distance;
            counterOfSuccess++;


            if (power == firstPower / 2) {
                if (exhaustionFactor != 0) {
                    power = power / exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(counterOfSuccess);
    }
}