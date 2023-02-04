package Methods.Excercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char one = sc.nextLine().charAt(0);
        char two = sc.nextLine().charAt(0);

        printCharactersInRange(one, two);
    }

    public static void printCharactersInRange(char one, char two) {
        if (one < two) {
            for (char i = (char) (one + 1); i < two; i++) {
                System.out.print(i+" ");
            }
        } else {
            for (char i = (char) (two + 1); i < one; i++) {
                System.out.print(i+" ");

            }
        }
    }
}
