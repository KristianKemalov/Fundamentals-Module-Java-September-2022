package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensed = new int[array.length - 1];

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array.length == 1) {
                break;
            }
            if (i == array.length - 1) {
                int[] condensedNew = new int[condensed.length - 1];
                i=-1;
                array=condensed;
                condensed=condensedNew;
            } else {
                condensed[i] = array[i] + array[i + 1];
            }
        }

        System.out.println(array[0]);
    }
}