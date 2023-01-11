package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        String regex="(\\|)(?<name>[A-Z]{4,})\\1:#(?<title>[A-Za-z]+ [A-Za-z]+)#";
        Pattern pattern=Pattern.compile(regex);

        for (int i = 1; i <=n ; i++) {
            String input=sc.nextLine();

            Matcher matcher= pattern.matcher(input);

            if (matcher.find()){
                System.out.printf("%s, The %s%n",matcher.group("name"),matcher.group("title"));
                System.out.printf(">> Strength: %d%n",matcher.group("name").length());
                System.out.printf(">> Armor: %d%n",matcher.group("title").length());

            }else {
                System.out.println("Access denied!");
            }


        }


    }
}
