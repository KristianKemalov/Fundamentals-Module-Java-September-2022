package Methods.Excercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());


        System.out.printf("%.2f",getFactorial(n1)*1.0/getFactorial(n2));
    }


    public static long getFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result  * i;

        }
        return result;
    }
}
