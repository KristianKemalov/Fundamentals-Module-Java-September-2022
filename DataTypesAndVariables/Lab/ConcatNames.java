package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1= sc.nextLine();
        String name2= sc.nextLine();
        String symbol= sc.nextLine();


        System.out.println(name1 + symbol + name2);
    }
}
