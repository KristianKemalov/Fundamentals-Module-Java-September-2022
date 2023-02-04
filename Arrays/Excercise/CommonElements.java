package Arrays.Excercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstArray=sc.nextLine().split(" ");
        String[] secondArray=sc.nextLine().split(" ");


        for (String element:secondArray) {
            for (String element2:firstArray){
                if (element.equals(element2)){
                    System.out.print(element+" ");
                    break;
                }
            }

        }


    }
}
