package Lists.Lab;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            if (command.equals("Contains")) {
                isContain(numbersList, Integer.parseInt(commandArr[1]));
            } else if (command.equals("Print")) {
                print(commandArr[1], numbersList);
                System.out.println();
            } else if (command.equals("Get")) {
                int sum = 0;
                for (int i = 0; i < numbersList.size(); i++) {
                    sum += numbersList.get(i);
                }
                System.out.println(sum);
            } else if (command.equals("Filter")) {
                filterNums(commandArr[1],Integer.parseInt(commandArr[2]),numbersList);
            }


            input = sc.nextLine();
        }
    }

    public static void isContain(List<Integer> nums, int number) {
        if (nums.contains(number)) {
            System.out.println("Yes");
        } else System.out.println("No such number");
    }

    public static void print(String evenOrOdd, List<Integer> nums) {
        if (evenOrOdd.equals("even")) {
            for (Integer num : nums) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        } else if (evenOrOdd.equals("odd")) {
            for (Integer num : nums) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }

    public static void filterNums(String condition,int number,List<Integer> nums){
        switch (condition){
            case ">":
                for (int num:nums){
                    if (num>number){
                        System.out.print(num+" ");
                    }
                }
                break;
            case "<":
                for (int num:nums){
                    if (num<number){
                        System.out.print(num+" ");
                    }
                }
                break;

            case"<=":
                for (int num:nums){
                    if (num<=number){
                        System.out.print(num+" ");
                    }
                }
                break;
            case ">=":
                for (int num:nums){
                    if (num>=number){
                        System.out.print(num+" ");
                    }
                }
                break;
        }
        System.out.println();
    }

}
