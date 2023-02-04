package TextProccesing.Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);
        int totalPower = 0;

        for (int i = 0; i <= textBuilder.length() - 1; i++) {
            char currentSymbol = textBuilder.charAt(i);
            if (currentSymbol == '>') {
                int explosionPower = Integer.parseInt(textBuilder.charAt(i + 1) + "");
                totalPower += explosionPower;

            } else if (currentSymbol != '>' && totalPower > 0) {
                textBuilder.deleteCharAt(i);
                totalPower--;
                i--;

            }

        }
        System.out.println(textBuilder);

    }
}
