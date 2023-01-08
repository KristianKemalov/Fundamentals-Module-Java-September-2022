package Arrays.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int leftSum = 0;
        int rightSum = 0;
        int counter=0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers.length == 1) {
                System.out.println(0);
                break;
            } else {

                for (int j = numbers.length - 1; j >= i + 1; j--) {
                    rightSum = rightSum + numbers[j];
                }
                for (int j = 0; j < i; j++) {
                    leftSum = leftSum + numbers[j];

                }
                if (leftSum == rightSum) {
                    System.out.println(i);
                    counter++;
                }

            }

            leftSum=0;
            rightSum=0;
        }

        if (counter==0&&numbers.length!=1){
            System.out.println("no");
        }
    }
}
