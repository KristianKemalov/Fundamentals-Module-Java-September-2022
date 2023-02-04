package Arrays.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] currentNum = sc.nextLine().split(" ");
            String firstNum = currentNum[0];
            String secondNum = currentNum[1];

            if (i % 2 == 0) {
                secondArray[i-1]=firstNum;
                firstArray[i-1]=secondNum;
            } else {
                firstArray[i-1]=firstNum;
                secondArray[i-1]=secondNum;
            }

        }

        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));
    }
}

