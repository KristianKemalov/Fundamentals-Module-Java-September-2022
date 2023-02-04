package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> topFive = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            sum += numbersList.get(i);
        }
        double averageNum = sum * 1.00 / numbersList.size();

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) > averageNum) {
                topFive.add(numbersList.get(i));
            }

        }

        Collections.sort(topFive);
        Collections.reverse(topFive);

        if (topFive.isEmpty()) {
            System.out.println("No");
        }
        if (topFive.size()>5){
            for (int i = 0; i <5 ; i++) {
                System.out.print(topFive.get(i)+" ");
            }
        }else {
            for (int i = 0; i <topFive.size() ; i++) {
                System.out.print(topFive.get(i)+" ");

            }
        }

    }
}