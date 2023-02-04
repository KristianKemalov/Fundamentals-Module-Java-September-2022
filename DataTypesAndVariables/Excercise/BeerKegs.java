package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbersKegs=Integer.parseInt(sc.nextLine());
        String maxKeg="";
        double maxVolume=Double.MIN_VALUE;

        for (int i = 1; i<=numbersKegs ; i++) {

            String kegModel= sc.nextLine();
            double radius=Double.parseDouble(sc.nextLine());
            int height=Integer.parseInt(sc.nextLine());
            double volume= Math.PI* Math.pow(radius,2)*height;
            if (volume>maxVolume){
                maxVolume=volume;
                maxKeg=kegModel;
            }

        }

        System.out.println(maxKeg);
    }
}
