package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[]data=sc.nextLine().split(" ");

        int bomber=Integer.parseInt(data[0]);
        int power=Integer.parseInt(data[1]);
        int sum=0;







    }
}
