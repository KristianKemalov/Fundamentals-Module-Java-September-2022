package BasicSyntax.Excercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n1=Integer.parseInt(sc.nextLine());
        int n2=Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int i = n1; i <=n2 ; i++) {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println();
        System.out.println("Sum: "+sum);

    }
}
