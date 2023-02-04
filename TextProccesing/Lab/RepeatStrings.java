package TextProccesing.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] wordsArr = sc.nextLine().split(" ");
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];
            int length = currentWord.length();
            String repeatWord = repeatString(currentWord, length);
            resultList.add(repeatWord);

        }
        System.out.println(String.join("", resultList));
    }


    public static String repeatString(String word, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word;

        }
        return result;
    }
}
