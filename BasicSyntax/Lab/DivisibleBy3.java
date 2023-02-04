package BasicSyntax.Lab;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <=100 ; i++) {
            if (i%3==0){
                System.out.printf("%d%n",i);
            }

        }
    }
}
