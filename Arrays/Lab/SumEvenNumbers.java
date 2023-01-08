package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String array = sc.nextLine();
        int sum = 0;

        int[] numbersArr = Arrays.stream(array.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbersArr.length; i++) {

            if (numbersArr[i] % 2 == 0) {
                sum += numbersArr[i];

            }

        }
        System.out.println(sum);

    }
}
