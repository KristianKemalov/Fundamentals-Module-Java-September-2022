package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberLines=Integer.parseInt(sc.nextLine());
        int sum=0;


        for (int i = 1; i <=numberLines ; i++) {
            sum+=sc.nextLine().charAt(0);
        }

        System.out.printf("The sum equals: %d",sum);

    }
}
