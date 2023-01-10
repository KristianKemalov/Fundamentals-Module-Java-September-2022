package Lists.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            if (input.contains("Delete")) {
                int numberToRemove = Integer.parseInt(input.split(" ")[1]);
                numsList.removeAll(Arrays.asList(numberToRemove));

            } else if (input.contains("Insert")) {
                int numberToInsert = Integer.parseInt(input.split(" ")[1]);
                int positionToInsert = Integer.parseInt(input.split(" ")[2]);
                numsList.add(positionToInsert, numberToInsert);
            }


            input = sc.nextLine();
        }
        System.out.println(numsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
