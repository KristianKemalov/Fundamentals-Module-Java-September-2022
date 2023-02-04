package Arrays.Excercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = sc.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = numbers[index1];
                int element2 = numbers[index2];

                numbers[index2] = element1;
                numbers[index1] = element2;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = numbers[index1];
                int element2 = numbers[index2];
                numbers[index1] = element1 * element2;


            } else if (command.equals("decrease")) {
                for (int i = 0; i <= numbers.length - 1; i++) {
                    numbers[i]--;

                }

            }


            command = sc.nextLine();
        }
        for (int i = 0; i <=numbers.length-1 ; i++) {
            if (i!=numbers.length-1){
                System.out.print(numbers[i]+", ");
            }else {
                System.out.print(numbers[i]);
            }

        }

    }
}
