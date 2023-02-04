package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int snowballs = Integer.parseInt(sc.nextLine());
        double snowballValue = Double.MIN_VALUE;
        int snowballSnowBiggest = 0;
        int snowballTTimeBiggest = 0;
        int snowballQualityBiggest = 0;


        for (int i = 1; i <= snowballs; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());
            double value = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (value > snowballValue) {
                snowballValue = value;
                snowballSnowBiggest = snowballSnow;
                snowballTTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowBiggest,snowballTTimeBiggest,snowballValue,snowballQualityBiggest);
    }
}
