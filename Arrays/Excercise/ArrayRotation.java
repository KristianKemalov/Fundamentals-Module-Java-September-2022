package Arrays.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(sc.nextLine());


        //51 47 32 61 21


        for (int i = 1; i <= rotations; i++) {
            int firstPosition = numbers[0];
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }

            numbers[numbers.length - 1] = firstPosition;

        }
        for (int num:numbers) {
            System.out.print(num+" ");

        }
    }
}
