package Arrays.Lab;

import java.util.Locale;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if (n>0 && n<8){
            System.out.println(days[n-1]);
        }else System.out.println("Invalid day!");
    }
}
