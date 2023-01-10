package RegularExpressions.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        List<String> furnitureNames = new ArrayList<>();
        double totalSpend = 0;
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {

                furnitureNames.add(matcher.group("furniture"));
                totalSpend += Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
            }

            input = sc.nextLine();
        }
        System.out.println("Bought furniture:");

        furnitureNames.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSpend);
    }
}
