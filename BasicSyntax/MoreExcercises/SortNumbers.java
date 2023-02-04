package BasicSyntax.MoreExcercises;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n1=Integer.parseInt(sc.nextLine());
        int n2=Integer.parseInt(sc.nextLine());
        int n3=Integer.parseInt(sc.nextLine());

        int max=0;
        int min=0;

        if (n1>n2&&n1>n3){
            max=n1;
        }else if (n2>n1 && n2>3){
            max=n2;
        }else if (n3>n2 &&n3>n1){
            max=n3;
        }

        if (n1<n2 &&n1<n3){
            min=n1;
        }else if (n2<n1 ){
            min=n2;
        }else if (n3<n1 &&n3<n2){
            min=n3;
        }
        if (max==n1 && min==n3) {
            System.out.println(max);
            System.out.println(n2);
            System.out.println(min);

        }

        if (max==n3 && min==n2){
            System.out.println(max);
            System.out.println(n1);
            System.out.println(min);
        }
        if (max==n2 && min==n3){
            System.out.println(max);
            System.out.println(n1);
            System.out.println(min);
        }
        if (max==n3 &&min==n1 &&n2!=min){
            System.out.println(max);
            System.out.println(n2);
            System.out.println(min);
        }if (max==n2 &&min==n1){
            System.out.println(max);
            System.out.println(n3);
            System.out.println(min);
        }




    }

}
