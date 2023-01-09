package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte n1=Byte.parseByte(sc.nextLine());
        byte n2=Byte.parseByte(sc.nextLine());
        byte n3=Byte.parseByte(sc.nextLine());
        byte n4=Byte.parseByte(sc.nextLine());


        int sum=n1+n2;
        int divide=sum/n3;
        int multiply=divide*n4;


        System.out.println(multiply);
    }
}
