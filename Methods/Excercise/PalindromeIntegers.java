package Methods.Excercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();


        while (!number.equals("END")) {
            if (isPalindrom(number)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            number = sc.nextLine();
        }

    }


    public static boolean isPalindrom(String number) {
        String reversedString = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reversedString += number.charAt(i);

        }
        if (reversedString.equals(number)) {
            return true;
        } else {
            return false;
        }
    }
}