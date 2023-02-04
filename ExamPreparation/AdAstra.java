package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String regex = "(#|\\|)(?<name>[A-Za-z\\s]+)\\1(?<expire>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int totalCalories = 0;
        StringBuilder output=new StringBuilder();
        while (matcher.find()) {
            String foodName = matcher.group("name");
            String expDate = matcher.group("expire");
            int calories =Integer.parseInt(matcher.group("calories"));
            totalCalories+=calories;
            output.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n",foodName,expDate,calories));

        }
        System.out.printf("You have food to last you for: %d days!%n",totalCalories/2000);
        System.out.println(output);
    }
}
