package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> shopList= Arrays.stream(sc.nextLine().split("!")).collect(Collectors.toList());

        String[] input=sc.nextLine().split(" ");
        String command=input[0];

        while (!command.equals("Go")){
            if (command.equals("Urgent")){
                if (!shopList.contains(input[1])){
                    shopList.add(0,input[1]);
                }

            }else if (command.equals("Unnecessary")){
                if (shopList.contains(input[1])){
                    shopList.remove(input[1]);
                }

            }else if (command.equals("Correct")){
                if (shopList.contains(input[1])){
                    shopList.set(shopList.indexOf(input[1]), input[2]);
                }

            }else if (command.equals("Rearrange")){
                if (shopList.contains(input[1])){
                    shopList.remove(input[1]);
                    shopList.add(input[1]);
                }

            }

            input=sc.nextLine().split(" ");
            command=input[0];
        }

        System.out.println(String.join(", ", shopList));
    }
}
