package Lists.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int commands = Integer.parseInt(sc.nextLine());
        List<String> listNames = new ArrayList<>();


        for (int i = 1; i <= commands; i++) {
            String input = sc.nextLine();
            String currentName=input.split(" ")[0];
            if (input.contains("is going!")){
                if (listNames.contains(currentName)){
                    System.out.println(currentName+" is already in the list!");
                }else {
                    listNames.add(currentName);
                }
            }else if (input.contains("is not going!")){
                if (listNames.contains(currentName)){
                    listNames.remove(currentName);
                }else {
                    System.out.println(currentName+" is not in the list!");
                }
            }
        }


        for (String names:listNames) {
            System.out.println(names);
        }
    }
}
