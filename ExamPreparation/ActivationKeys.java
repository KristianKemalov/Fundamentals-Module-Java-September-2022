package ExamPreparation;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String activationKey = sc.nextLine();
        String input = sc.nextLine();


        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            int startIndex = 0;
            int endIndex = 0;
            String substring = "";
            if (tokens[0].equals("Contains")) {
                substring = tokens[1];
                if (activationKey.contains(substring)) {
                    System.out.printf("%s contains %s%n", activationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }


            } else if (tokens[0].equals("Flip")) {
                String upperOrLower = tokens[1];
                startIndex = Integer.parseInt(tokens[2]);
                endIndex = Integer.parseInt(tokens[3]);
                substring = activationKey.substring(startIndex, endIndex);
                if (upperOrLower.equals("Upper")) {
                    activationKey = activationKey.replace(substring, substring.toUpperCase());
                } else if (upperOrLower.equals("Lower")) {
                    activationKey = activationKey.replace(substring, substring.toLowerCase());
                }

                System.out.println(activationKey);

            } else if (tokens[0].equals("Slice")) {

                startIndex = Integer.parseInt(tokens[1]);
                endIndex = Integer.parseInt(tokens[2]);
                substring=activationKey.substring(startIndex,endIndex);

                activationKey=activationKey.replace(substring,"");

                System.out.println(activationKey);
            }


            input = sc.nextLine();
        }
        System.out.printf("Your activation key is: %s",activationKey);
    }
}