package Methods.Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        printNumberSign(n);



    }public static void printNumberSign(int n){

        if (n>0){
            System.out.printf("The number %d is positive.",n);
        }else if (n<0){
            System.out.printf("The number %d is negative.",n);
        }else {
            System.out.printf("The number %d is zero.",n);
        }
    }



}
