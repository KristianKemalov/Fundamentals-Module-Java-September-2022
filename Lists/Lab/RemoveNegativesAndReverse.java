package Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        numbersList.removeIf(e -> e < 0);
        Collections.reverse(numbersList);

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        if (numbersList.size() == 0) {
            System.out.println("empty");
        }

    }
}
