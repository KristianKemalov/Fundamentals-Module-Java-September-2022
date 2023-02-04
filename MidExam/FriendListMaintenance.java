package MidExam;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> friendsList = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String[] input = sc.nextLine().split(" ");
        String command = input[0];
        List<String> blackList=new ArrayList<>();
        List<String> lostList=new ArrayList<>();

        while (!command.equals("Report")) {
            if (command.equals("Blacklist")) {
                if (friendsList.contains(input[1])){
                    friendsList.set(friendsList.indexOf(input[1]), "Blacklisted");
                    System.out.printf("%s was blacklisted.%n",input[1]);
                    blackList.add(input[1]);
                }else {
                    System.out.printf("%s was not found.%n",input[1]);
                }

            } else if (command.equals("Error")) {
                if (isIndexValid(Integer.parseInt(input[1]),friendsList)){
                    if (!friendsList.get(Integer.parseInt(input[1])).equals("Blacklisted")&&!friendsList.get(Integer.parseInt(input[1])).equals("Lost")){
                        System.out.printf("%s was lost due to an error.%n",friendsList.get(Integer.parseInt(input[1])));
                        friendsList.set((Integer.parseInt(input[1])),"Lost");
                        lostList.add(input[1]);
                    }
                }

            } else if (command.equals("Change")) {
                if (isIndexValid(Integer.parseInt(input[1]),friendsList)){
                    System.out.printf("%s changed his username to %s.%n",friendsList.get(Integer.parseInt(input[1])),input[2]);
                    friendsList.set(Integer.parseInt(input[1]),input[2]);
                }

            }


            input = sc.nextLine().split(" ");
            command = input[0];
        }

        System.out.printf("Blacklisted names: %d%n",blackList.size());
        System.out.printf("Lost names: %d%n",lostList.size());
        System.out.println(String.join(" ",friendsList));

    }

    public static boolean isIndexValid(int index,List<String> friends){

        if (index>=0&&index<=friends.size()-1){
            return true;
        }else return false;
    }
}
