package Methods.Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int result = 0;

        if (command.equals("add")){
            add(n,n2,result);
        }else if (command.equals("multiply")){
            multiply(n,n2,result);
        }else if (command.equals("subtract")){
            subtract(n,n2,result);
        }else if (command.equals("divide")){
            divide(n,n2,result);
        }

    }

    public static void add(int n, int n2, int result) {
        result = n + n2;
        System.out.println(result);

    }

    public static void multiply(int n, int n2, int result) {
        result = n * n2;
        System.out.println(result);
    }
    public static void subtract(int n, int n2, int result) {
        result = n - n2;
        System.out.println(result);
    }
    public static void divide(int n, int n2, int result) {
        result = n / n2;
        System.out.println(result);
    }
}

