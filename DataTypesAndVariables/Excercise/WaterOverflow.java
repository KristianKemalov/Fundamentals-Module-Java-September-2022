package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numberOfLines = Integer.parseInt(sc.nextLine());
        int tankSpace = 255;
        int sum=0;
        for (int i = 1; i <= numberOfLines; i++) {
            int currentLitres = Integer.parseInt(sc.nextLine());
            sum+=currentLitres;
            if (sum > tankSpace) {
                System.out.println("Insufficient capacity!");
                sum-=currentLitres;
            }

        }
        System.out.println(sum);

    }
}
