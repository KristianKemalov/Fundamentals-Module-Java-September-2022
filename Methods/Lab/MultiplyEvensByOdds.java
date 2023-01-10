package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(Math.abs(getEvenSum(number)*getOddSum(number)));

    }

    public static int getEvenSum(int number) {
        int sum = 0;
        while (Math.abs(number) > 0) {
            int currentNumber = number % 10;
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }
            number = number / 10;
        }
        return sum;
    }

    public static int getOddSum(int number) {
        int sum = 0;
        while (Math.abs(number) > 0) {
            int currentNumber = number % 10;
            if (currentNumber % 2 != 0) {
                sum += currentNumber;
            }
            number = number / 10;
        }
        return sum;
    }
}
