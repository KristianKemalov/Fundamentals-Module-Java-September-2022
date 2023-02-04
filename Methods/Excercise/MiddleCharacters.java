package Methods.Excercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        findLength(input);
    }



    public static void findLength(String input){
        if (input.length()%2==0){
            int firstMiddle=input.length()/2;
            int secondMiddle=input.length()/2-1;
            System.out.println(""+input.charAt(secondMiddle)+input.charAt(firstMiddle));
        }else {
            System.out.println(""+input.charAt(input.length()/2));
        }

    }
}
