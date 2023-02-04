package Lists.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sumRemoved = 0;

        while (numbersList.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());
            if (index >= 0 && index <= numbersList.size() - 1) {
                int elementRemoved = numbersList.get(index);
                sumRemoved += elementRemoved;
                numbersList.remove(index);
                modifyList(numbersList, elementRemoved);
            } else if (index < 0) {
                int firstNum = numbersList.get(0);
                sumRemoved += firstNum;
                numbersList.remove(0);
                int lastNum = numbersList.get(numbersList.size() - 1);
                numbersList.add(0, lastNum);

                modifyList(numbersList, firstNum);
            } else if (index > numbersList.size() - 1) {
                int lastNum = numbersList.get(numbersList.size() - 1);
                sumRemoved += lastNum;
                numbersList.remove(numbersList.size() - 1);
                int firstNum = numbersList.get(0);
                numbersList.add(firstNum);
                modifyList(numbersList, lastNum);

            }
        }
        System.out.println(sumRemoved);
    }

    private static void modifyList(List<Integer> numbersList, int elementRemoved) {
        for (int i = 0; i <= numbersList.size() - 1; i++) {
            int currentNum = numbersList.get(i);
            if (currentNum <= elementRemoved) {
                currentNum += elementRemoved;
            } else {
                currentNum -= elementRemoved;
            }
            numbersList.set(i, currentNum);
        }
    }
}
