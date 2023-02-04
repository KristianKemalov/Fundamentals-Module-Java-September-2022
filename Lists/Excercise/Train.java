package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Integer> listOfWagon= Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity=Integer.parseInt(sc.nextLine());

        String command=sc.nextLine();

        while (!command.equals("end")){
            if (command.contains("Add")){
                listOfWagon.add(Integer.parseInt(command.split(" ")[1]));
            }else {
                int passengersToFit=Integer.parseInt(command);
                for (int i = 0; i <=listOfWagon.size()-1 ; i++) {
                    if (passengersToFit+listOfWagon.get(i)<=maxCapacity){
                        listOfWagon.set(i,passengersToFit+listOfWagon.get(i));
                        break;
                    }
                }
            }
            command= sc.nextLine();
        }

        System.out.println(listOfWagon.toString().replaceAll("[\\[\\],]",""));
    }
}
