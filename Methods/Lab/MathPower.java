package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double n=Double.parseDouble(sc.nextLine());
        double n2=Double.parseDouble(sc.nextLine());
        double result=mathPower(n,n2);

        DecimalFormat df=new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }



private static double mathPower(double n,double n2){
    return Math.pow(n,n2);

}
}
