package ExamPreparation;

import javax.naming.directory.InvalidAttributesException;
import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String stops = sc.nextLine();
        String command = sc.nextLine();


        while (!command.equals("Travel")) {
            String[] commandArr = command.split(":");
            String type = commandArr[0];

            if (type.equals("Add Stop")) {
                int index = Integer.parseInt(commandArr[1]);
                String currentString = commandArr[2];
                String substing = stops.substring(index, index + 1);
                if (index <= stops.length()) {
                    stops = stops.replaceFirst(substing, currentString + substing);
                    System.out.println(stops);
                }else {
                    System.out.println(stops);
                }

            } else if (type.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);

                if (startIndex <= stops.length() && endIndex <= stops.length()) {
                    String substringToRemove = stops.substring(startIndex, endIndex + 1);
                    stops = stops.replaceAll(substringToRemove, "");
                    System.out.println(stops);
                }else {
                    System.out.println(stops);
                }

            } else if (type.equals("Switch")) {
                String oldString = commandArr[1];
                String newString = commandArr[2];

                if (stops.contains(oldString)) {
                    stops = stops.replaceAll(oldString, newString);
                    System.out.println(stops);
                }else {
                    System.out.println(stops);
                }

            }
            command = sc.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
