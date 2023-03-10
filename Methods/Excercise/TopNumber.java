package Methods.Excercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n ; i++) {
            if (divideBy8(i)&&isContainOdd(i)){
                System.out.println(i);
            }

        }

    }


    public static boolean divideBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean isContainOdd(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}

