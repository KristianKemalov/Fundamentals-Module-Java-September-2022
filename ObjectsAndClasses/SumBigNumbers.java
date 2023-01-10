package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n1=new BigInteger(sc.nextLine());
        BigInteger n2=new BigInteger(sc.nextLine());


        BigInteger result=n1.add(n2);
        System.out.println(result);

    }
}
