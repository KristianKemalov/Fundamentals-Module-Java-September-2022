package DataTypesAndVariables.Excercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        int p=Integer.parseInt(sc.nextLine());


        double courses = Math.ceil(n * 1.0 / p);
        System.out.printf("%.0f", courses);
    }
}
