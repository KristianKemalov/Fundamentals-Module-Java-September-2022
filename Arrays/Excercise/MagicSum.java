package Arrays.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int givenNum = Integer.parseInt(sc.nextLine());


        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNum = numbers[i];

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int inNum = numbers[j];
                if (currentNum+inNum==givenNum){
                    System.out.println(currentNum + " " + inNum);
                }
            }

        }
    }
}
