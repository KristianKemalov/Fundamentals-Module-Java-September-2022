package TextProccesing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernamesArr = sc.nextLine().split(", ");

        for (String username : usernamesArr) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }

        }
    }

    public static boolean isValidUsername(String username) {
        boolean isValidLength = username.length() >= 3 && username.length() <= 16;

        boolean isValidContent = false;

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;

            }
            isValidContent = true;
        }
        return isValidContent && isValidLength;
    }
}
