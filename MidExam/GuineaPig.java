package MidExam;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double foodInKg=Double.parseDouble(sc.nextLine());
        double hayInKg=Double.parseDouble(sc.nextLine());
        double coverInKg=Double.parseDouble(sc.nextLine());
        double weightInKg=Double.parseDouble(sc.nextLine());

        double foodInGr=foodInKg*1000;
        double hayInGr=hayInKg*1000;
        double coverInGr=coverInKg*1000;
        double weightInGr=weightInKg*1000;
        boolean isEmpty=false;


        for (int i = 1; i <=30 ; i++) {
            foodInGr-=300;
            if (i%2==0){
                hayInGr-=foodInGr*0.05;
            }
            if (i%3==0){
                coverInGr-=weightInGr/3;
            }
            if (foodInGr<=0||coverInGr<=0|| hayInGr<=0){
                isEmpty=true;
                System.out.println("Merry must go to the pet store!");
                break;
            }

        }
        if (!isEmpty){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodInGr/1000,hayInGr/1000,coverInGr/1000);

        }
    }
}
