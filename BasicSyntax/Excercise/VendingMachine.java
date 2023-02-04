package BasicSyntax.Excercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        String text = sc.nextLine();

        while (!text.equals("Start")) {
            double coins = Double.parseDouble(text);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            }else {
                System.out.printf("Cannot accept %.2f%n",coins);
            }
            text = sc.nextLine();
        }


        String product= sc.nextLine();

        while (!product.equals("End")) {
            if (product.equals("Nuts")){
                if (sum>=2){
                    System.out.printf("Purchased %s%n",product);
                    sum-=2;
                }else System.out.println("Sorry, not enough money");
            }else if (product.equals("Water")){
                if (sum>=0.7){
                    System.out.printf("Purchased %s%n",product);
                    sum-=0.7;
                }else System.out.println("Sorry, not enough money");
            }else if (product.equals("Crisps")){
                if (sum>=1.5){
                    System.out.printf("Purchased %s%n",product);
                    sum-=1.5;
                }else System.out.println("Sorry, not enough money");
            }else if (product.equals("Soda")){
                if (sum>=0.8){
                    System.out.printf("Purchased %s%n",product);
                    sum-=0.8;
                }else  System.out.println("Sorry, not enough money");
            }else if (product.equals("Coke")){
                if (sum>=1){
                    System.out.printf("Purchased %s%n",product);
                    sum-=1;
                }else System.out.println("Sorry, not enough money");
            }else System.out.println("Invalid product");

            product= sc.nextLine();

        }

        System.out.printf("Change: %.2f",sum);
    }
}