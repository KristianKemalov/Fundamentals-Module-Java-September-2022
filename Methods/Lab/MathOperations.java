package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int secondNum = Integer.parseInt(sc.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(calculate(firstNum, operator, secondNum)));
    }


    public static double calculate(int firstNum, String operator, int secondNum) {
        double result = 0;
        switch (operator) {
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;

        }
        return result;

    }

}
