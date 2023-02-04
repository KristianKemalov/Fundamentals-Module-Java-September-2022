package BasicSyntax.Excercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        double sum=0;
        double totalsum=0;

        for (int i = 1; i <=n ; i++) {
            double pricepercapsule=Double.parseDouble(sc.nextLine());
            int days=Integer.parseInt(sc.nextLine());
            int capsules=Integer.parseInt(sc.nextLine());
            sum=(days*capsules)*pricepercapsule;

            System.out.printf("The price for the coffee is: $%.2f%n",sum);
            totalsum+=sum;

        }

        System.out.printf("Total: $%.2f",totalsum);

    }
}
