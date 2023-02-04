package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstInput = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondInput = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean isValid = false;
        int wrondIndex = 0;

        for (int i = 0; i <= firstInput.length - 1; i++) {

            if (firstInput[i] == secondInput[i]) {
                sum += firstInput[i];
            } else {
                isValid = true;
                wrondIndex = i;
                break;
            }


        }
        if (isValid == false) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else System.out.printf("Arrays are not identical. Found difference at %d index.", wrondIndex);
    }
}