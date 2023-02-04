package TextProccesing.Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] banWords = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for (String banWord : banWords) {

            text = text.replace(banWord, repeatString("*", banWord.length()));

        }
        System.out.println(text);
    }

    public static String repeatString(String word, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word;

        }
        return result;
    }
}
