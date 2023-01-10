package Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        int result= calculateArea(width,length);
        System.out.println(result);
    }


    public static int calculateArea(int n, int n2) {
        return n*n2;

    }
}
