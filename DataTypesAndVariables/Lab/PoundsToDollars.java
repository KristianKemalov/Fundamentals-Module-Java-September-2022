package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pound=Float.parseFloat(sc.nextLine());

        float dollars=pound*1.36f;

        System.out.printf("%.3f",dollars);
    }
}
