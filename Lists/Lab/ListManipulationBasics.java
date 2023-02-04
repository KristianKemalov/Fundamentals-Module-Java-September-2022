package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input=sc.nextLine();

        while (!input.equals("end")){
            String[] commandArr=input.split(" ");
            String command=commandArr[0];

            if (commandArr[0].equals("Add")){
                int numToAdd=Integer.parseInt(commandArr[1]);
                numbersList.add(numToAdd);
            }else if (commandArr[0].equals("Remove")){
                int numToRemove=Integer.parseInt(commandArr[1]);
                numbersList.remove(Integer.valueOf(numToRemove));
            }else if (commandArr[0].equals("RemoveAt")){
                int indexRemove=Integer.parseInt(commandArr[1]);
                numbersList.remove(indexRemove);
            }else if (commandArr[0].equals("Insert")){
                int numberInsert=Integer.parseInt(commandArr[1]);
                int indexInsert=Integer.parseInt(commandArr[2]);
                numbersList.add(indexInsert,numberInsert);
            }





            input=sc.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
