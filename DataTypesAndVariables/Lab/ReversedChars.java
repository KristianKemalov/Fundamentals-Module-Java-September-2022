package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstSymbol=sc.nextLine().charAt(0);
        char secondSymbol=sc.nextLine().charAt(0);
        char thirdSymbol=sc.nextLine().charAt(0);


        System.out.printf("%c %c %c",thirdSymbol,secondSymbol,firstSymbol);



    }
}
