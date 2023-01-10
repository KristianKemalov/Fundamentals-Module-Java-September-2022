package MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(sc.nextLine());
        int numberOfLectures = Integer.parseInt(sc.nextLine());
        int additionalBonus = Integer.parseInt(sc.nextLine());
        double totalBonus=0;
        double maxPoints=0;

        int lectures=0;
//{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        for (int i = 1; i <= numberOfStudents; i++) {
            int currentAttedance=Integer.parseInt(sc.nextLine());
            totalBonus=currentAttedance*1.00/numberOfLectures*(5+additionalBonus);

            if (totalBonus>=maxPoints){
                maxPoints=totalBonus;
                lectures=currentAttedance;
            }

        }

        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxPoints));
        System.out.printf("The student has attended %d lectures.",lectures);    }
}
