package BasicSyntax.Excercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people=Integer.parseInt(sc.nextLine());
        String kind= sc.nextLine();
        String day= sc.nextLine();
        double price=0;

        switch (day){
            case "Friday":
                if (kind.equals("Students")){
                    price=8.45*people;
                }else if (kind.equals("Business")){
                    price= 10.90*people;
                }else price=15*people;
                break;
            case "Saturday":
                if (kind.equals("Students")){
                    price=9.8*people;
                }else if (kind.equals("Business")){
                    price= 15.60*people;
                }else price=20*people;
                break;
            case "Sunday" :
                if (kind.equals("Students")){
                    price=10.46*people;
                }else if (kind.equals("Business")){
                    price= 16*people;
                }else price=22.5*people;
                break;

        }

    if (kind.equals("Students")&& people>=30){
        price=price*0.85;
    }else if (kind.equals("Business")&&people>=100){
        if (day.equals("Friday")){
            price=price-(10*10.9);
        }else if (day.equals("Saturday")){
            price=price-(10*15.6);
        }else if (day.equals("Sunday")){
            price=price-(10*16);
        }
    }else if (kind.equals("Regular")&& people>=10 && people<=20){
        price=price*0.95;
    }

        System.out.printf("Total price: %.2f",price);
    }
}
