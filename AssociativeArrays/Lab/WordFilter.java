package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words=Arrays.stream(sc.nextLine().split(" "))
                .filter(e->e.length()%2==0)
                .toArray(String[]::new);


        System.out.println(String.join(System.lineSeparator(),words));
    }
}
