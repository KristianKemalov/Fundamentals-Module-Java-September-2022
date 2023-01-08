package Arrays.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i <= numbers.length - 1; i++) {

            int currentNum = numbers[i];
            if (i == numbers.length - 1) {
                System.out.print(currentNum + " ");
                break;
            }
            boolean isTop = false;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int nextNum = numbers[j];
                if (currentNum > nextNum) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNum+" ");
            }
        }
    }
}
