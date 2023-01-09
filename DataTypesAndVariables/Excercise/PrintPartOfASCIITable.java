package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int startCode=Integer.parseInt(sc.nextLine());
        int endCode=Integer.parseInt(sc.nextLine());


        for (int i = startCode; i <=endCode ; i++) {

            System.out.print((char)i + " ");

        }
    }
}
