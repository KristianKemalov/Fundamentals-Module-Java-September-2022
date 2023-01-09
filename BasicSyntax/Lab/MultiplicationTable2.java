package BasicSyntax.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1=Integer.parseInt(sc.nextLine());
        int n2=Integer.parseInt(sc.nextLine());

        if (n2<11){
            for (int i = n2; i <=10 ; i++) {
                System.out.printf("%d X %d = %d%n",n1,i,n1*i);
                
            }
        }else System.out.printf("%d X %d = %d",n1,n2,n1*n2);


    }
}
