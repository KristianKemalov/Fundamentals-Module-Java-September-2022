package Methods.Excercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        getVowels(text.toLowerCase());
    }


    public static void getVowels(String text) {
        int counter = 0;

        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'o' || symbol == 'i' || symbol == 'u') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}