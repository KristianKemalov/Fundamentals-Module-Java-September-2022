package Methods.Excercise;

import javax.swing.plaf.SplitPaneUI;
import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        System.out.println(getResult(n1,n2,n3));
    }

    public static int getResult(int n1, int n2, int n3) {

        return getSum(n1, n2) - n3;
    }

    public static int getSum(int n1, int n2) {

        return n1 + n2;
    }

}

