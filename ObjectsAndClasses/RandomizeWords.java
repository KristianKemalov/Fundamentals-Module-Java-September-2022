package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] input=sc.nextLine().split(" ");

        Random generator=new Random();

        for (int i = 0; i <input.length ; i++) {
            int indexX=generator.nextInt(input.length);
            int indexY=generator.nextInt(input.length);

            String oldWordX=input[indexX];

            input[indexX]=input[indexY];
            input[indexY]=oldWordX;

            
        }
        System.out.println(String.join(System.lineSeparator(),input));
    }
}
