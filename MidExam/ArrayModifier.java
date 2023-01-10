package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[]input=sc.nextLine().split(" ");

        String command=input[0];


        while (!command.equals("end")){

            if (command.equals("swap")){
                int indexOne=Integer.parseInt(input[1]);
                int indexTwo=Integer.parseInt(input[2]);

                int valueAtIndexOne=numbersArr[indexOne];
                int valueAtIndexTwo=numbersArr[indexTwo];

                numbersArr[indexOne]=valueAtIndexTwo;
                numbersArr[indexTwo]=valueAtIndexOne;

            }
            else if (command.equals("multiply")){
                int indexOne=Integer.parseInt(input[1]);
                int indexTwo=Integer.parseInt(input[2]);

                int product=numbersArr[indexOne]*numbersArr[indexTwo];
                numbersArr[indexOne]=product;

            }
            else if (command.equals("decrease")){
                for (int i = 0; i <=numbersArr.length-1 ; i++) {
                    numbersArr[i]-=1;

                }
            }
            input=sc.nextLine().split(" ");
            command=input[0];


        }
        for (int i = 0; i < numbersArr.length ; i++) {
            if (numbersArr.length-1==i){
                System.out.print(numbersArr[i]);
            }else System.out.print(numbersArr[i]+", ");

        }
    }
}
