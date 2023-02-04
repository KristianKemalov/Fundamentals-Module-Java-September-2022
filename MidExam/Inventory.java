package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> inventory = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String[] input = sc.nextLine().split(" - ");
        String command = input[0];

        while (!command.equals("Craft!")) {

            if (command.equals("Drop")) {
                if (inventory.contains(input[1])) {
                    inventory.remove(input[1]);
                }
            } else if (command.equals("Collect")) {
                if (!inventory.contains(input[1])) {
                    inventory.add(input[1]);
                }
            } else if (command.equals("Combine Items")) {
                String[] current = input[1].split(":");
                if (inventory.contains(current[0])) {
                    int index = inventory.indexOf(current[0]);
                    inventory.add(index + 1, current[1]);
                }


            } else if (command.equals("Renew")) {
                if (inventory.contains(input[1])) {

                    inventory.remove(input[1]);
                    inventory.add(input[1]);
                }


            }


            input = sc.nextLine().split(" - ");
            command = input[0];
        }
        for (int i = 0; i <inventory.size() ; i++) {
            if (i==inventory.size()-1){
                System.out.print(inventory.get(i));
            }else System.out.print(inventory.get(i)+", ");

        }
    }
}
