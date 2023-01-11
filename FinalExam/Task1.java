package FinalExam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String command = sc.nextLine();


        while (!command.equals("End")) {
            String[] commandArr = command.split("\\s+");

            if (command.contains("Translate")) {
                input = input.replaceAll(commandArr[1], commandArr[2]);
                System.out.println(input);

            } else if (command.contains("Includes")) {
                String substring = commandArr[1];
                if (input.contains(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.contains("Start")) {
                String substring = commandArr[1];
                if (input.startsWith(substring)){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }


            } else if (command.contains("Lowercase")) {
                input = input.toLowerCase();
                System.out.println(input);

            } else if (command.contains("FindIndex")) {
                String charToFind = commandArr[1];
                int lastIndex = input.lastIndexOf(charToFind);
                System.out.println(lastIndex);

            } else if (command.contains("Remove")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int count = Integer.parseInt(commandArr[2]);
                String substringToRemove = input.substring(startIndex, count+startIndex);

                input = input.replaceFirst(substringToRemove, "");

                System.out.println(input);

            }


            command = sc.nextLine();


        }


    }
}
