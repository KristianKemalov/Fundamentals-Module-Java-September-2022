package BasicSyntax.Excercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int sum=0;
        int startnumber=n;

        while (n>0){

            int lastDigit=n%10;
            int fact=1;
            for (int i = 1; i <=lastDigit ; i++) {
                fact = fact * i;
            }
            sum+=fact;
            n=n/10;

   }
        if (sum==startnumber){
            System.out.println("yes");
        }else System.out.println("no");







    }
}
