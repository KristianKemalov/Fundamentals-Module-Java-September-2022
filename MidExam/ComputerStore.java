package MidExam;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //"Congratulations you've just bought a new computer!
        //Price without taxes: {total price without taxes}$
        //Taxes: {total amount of taxes}$
        //-----------
        //Total price: {total price with taxes}$"


        String command = sc.nextLine();
        double sum = 0;
        double taxes = 0;
        while (!command.equals("special") && !command.equals("regular")) {
            double currentPrice = Double.parseDouble(command);


            if (currentPrice < 0) {
                System.out.println("Invalid price!");
                command = sc.nextLine();
                continue;
            }
            sum += currentPrice;
            taxes += currentPrice * 0.2;


            command = sc.nextLine();
        }

        double total=sum+taxes;
        if (command.equals("special")){
            total=total*0.9;
        }
        if (total==0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",sum);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",total);
        }
    }
}
