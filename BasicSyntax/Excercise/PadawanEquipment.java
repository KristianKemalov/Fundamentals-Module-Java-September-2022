package BasicSyntax.Excercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money=Double.parseDouble(sc.nextLine());
        int students=Integer.parseInt(sc.nextLine());
        double lightsabersPrice=Double.parseDouble(sc.nextLine());
        double robesPrice=Double.parseDouble(sc.nextLine());
        double beltsPrice=Double.parseDouble(sc.nextLine());



        double lightsabersCost= Math.ceil(students * 1.1)*lightsabersPrice;
        double robesCost=students*robesPrice;
        double beltsCost=(students-students/6)*beltsPrice;

        double totalCost=robesCost+beltsCost+lightsabersCost;
        if (money>=totalCost){
            System.out.printf("The money is enough - it would cost %.2flv.",totalCost);
        }else System.out.printf("George Lucas will need %.2flv more.",totalCost-money);




    }
}
