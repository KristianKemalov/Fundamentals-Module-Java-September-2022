package Methods.Excercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        printMatrix(n);
    }



public static void printMatrix (int n){
    for (int i = 1; i <=n ; i++) {
        System.out.println();
        for (int j = 1; j <=n ; j++) {
            System.out.print(n+ " ");

        }

    }
}
}
