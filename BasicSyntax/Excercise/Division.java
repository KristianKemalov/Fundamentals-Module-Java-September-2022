package BasicSyntax.Excercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        int maxDev=0;
        if (num%2==0){
            maxDev=2;
        }
        if (num%3==0){
            maxDev=3;
        }
        if (num%6==0){
            maxDev=6;
        }
        if (num%7==0){
            maxDev=7;
        }
        if (num%10==0){
            maxDev=10;
        }

        if (maxDev==0){
            System.out.println("Not divisible");
        }else System.out.printf("The number is divisible by %d",maxDev);


    }

}
