package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        String command = sc.nextLine();

        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int numToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbersList.add(numToAdd);
            } else if (command.contains("Insert")) {
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValidIndex(index, numbersList)) {
                    numbersList.add(index, numberToAdd);
                } else System.out.println("Invalid index");

            } else if (command.contains("Remove")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                if (isValidIndex(index, numbersList)) {
                    numbersList.remove(index);
                }else System.out.println("Invalid index");
            } else if (command.contains("Shift left")) {
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < countShiftLeft; i++) {
                    int firstNum = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNum);

                }
            } else if (command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < countShiftRight; i++) {
                    int lastNum = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, lastNum);

                }
            }


            command = sc.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isValidIndex(int index, List<Integer> numbers) {
        return (index >= 0 && index <= numbers.size() - 1);
    }
}
