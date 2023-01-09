package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;



        for (int number = Integer.parseInt(sc.nextLine()); number > 0; number = number / 10) {
            int lastDigit = number % 10;
            sum += lastDigit;
        }

        System.out.println(sum);

    }

}
