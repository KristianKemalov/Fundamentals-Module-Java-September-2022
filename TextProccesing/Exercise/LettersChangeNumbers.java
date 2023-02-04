package TextProccesing.Exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] codesArr = input.split("\\s+");

        double totalSum = 0;

        for (String code : codesArr) {
            double modifiedNum = getModifiedNum(code);
            totalSum += modifiedNum;

        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNum(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            int positionUpperLetter = (int) firstLetter - 64;
            number = number / positionUpperLetter;
        } else {
            int positionLowerLetter = (int) firstLetter - 96;
            number = number * positionLowerLetter;

        }
        if (Character.isUpperCase(secondLetter)) {
            int positionUpperLetter = (int) secondLetter - 64;
            number = number - positionUpperLetter;
        } else {
            int positionLowerLetter = (int) secondLetter - 96;
            number = number + positionLowerLetter;
        }
        return number;
    }
}
