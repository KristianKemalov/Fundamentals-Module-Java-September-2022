package MidExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstEmpCanAnswer = Integer.parseInt(sc.nextLine());
        int secondEmpCanAnswer = Integer.parseInt(sc.nextLine());
        int thirdEmpCanAnswer = Integer.parseInt(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        int answersPerHour = firstEmpCanAnswer + secondEmpCanAnswer + thirdEmpCanAnswer;
        int counter = 0;

        while (students > 0) {
            counter++;
            if (counter % 4 == 0 && counter != 0) {
                continue;
            }
            students -= answersPerHour;


        }
        System.out.printf("Time needed: %dh.", counter);
    }
}