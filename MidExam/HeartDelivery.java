package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] neededHearts = Arrays.stream(sc.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String[] input = sc.nextLine().split(" ");
        String command = input[0];
        int jump = Integer.parseInt(input[1]);
        int lastIndex = 0;

        while (!command.equals("Love!")) {
            if (jump+lastIndex>neededHearts.length){
                lastIndex=0;
            }
            if (neededHearts[lastIndex + jump] == 0) {
                System.out.printf("Place %d already had Valentine's day.", lastIndex);
            }
            neededHearts[jump + lastIndex] -= 2;
            if (neededHearts[jump] == 0) {
                System.out.printf("Place %d has Valentine's day.", jump);

            }



            input = sc.nextLine().split(" ");
            command = input[0];
            lastIndex = lastIndex + jump;
            if (!input[1].equals("!")) {
                jump = Integer.parseInt(input[1]);
            }

        }

    }
}
