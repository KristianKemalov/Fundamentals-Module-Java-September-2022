package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String symbol1 = sc.nextLine();
        String symbol2 = sc.nextLine();
        String symbol3 = sc.nextLine();

        String result = String.format("%s%s%s",symbol1,symbol2,symbol3);

        System.out.println(result);
    }
}
