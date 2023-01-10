package Methods.Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        printTotalPrice(type,quantity);
    }


    public static void printTotalPrice(String type, int quantity) {
        switch (type) {
            case "water":
                double total = quantity;
                System.out.printf("%.2f",total);
                break;
            case "coffee":
                 total=quantity*1.5;
                System.out.printf("%.2f",total);
                 break;
            case "coke":
                total=quantity*1.4;
                System.out.printf("%.2f",total);
                break;
            case"snacks":
                total=quantity*2;
                System.out.printf("%.2f",total);
                break;
        }
    }
}

