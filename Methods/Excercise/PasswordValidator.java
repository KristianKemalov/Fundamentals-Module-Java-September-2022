package Methods.Excercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        if (!firstRule(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!secondRule(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!thirdRule(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (firstRule(password) && secondRule(password) && thirdRule(password)) {
            System.out.println("Password is valid");
        }

    }


    public static boolean firstRule(String password) {
        if (password.length() >= 6) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean secondRule(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }


    public static boolean thirdRule(String password) {
        int count = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }
}