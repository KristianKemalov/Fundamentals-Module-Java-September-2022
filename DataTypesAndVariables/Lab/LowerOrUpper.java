package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char symbol=sc.nextLine().charAt(0);


            if (Character.isUpperCase(symbol)){
                System.out.println("upper-case");
            }else System.out.println("lower-case");
    }
}
