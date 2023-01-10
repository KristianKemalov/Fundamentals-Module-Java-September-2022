package Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int timesRepeat = Integer.parseInt(sc.nextLine());
        System.out.println(printRepeat(timesRepeat, input));
    }


    public static String printRepeat (int times,String input) {
            String result="";
        for (int i = 1; i <= times; i++) {
            result=result+input;

        }
        return result;
    }
}


