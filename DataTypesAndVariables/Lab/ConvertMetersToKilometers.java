package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int metres=Integer.parseInt(sc.nextLine());

        double kilometres=metres/1000.0;

        System.out.printf("%.2f",kilometres);
    }
}
