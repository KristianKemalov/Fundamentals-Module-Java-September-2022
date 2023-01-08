package Arrays.Excercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int nLines=Integer.parseInt(sc.nextLine());

        int[] wagonArr=new int[nLines];
        int sum=0;
        for (int i = 0; i <nLines ; i++) {
            int currentPeople=Integer.parseInt(sc.nextLine());
            wagonArr[i]=currentPeople;
            sum+=currentPeople;
        }

        for (int i = 0; i <wagonArr.length ; i++) {
            System.out.print(wagonArr[i] + " ");

        }
        System.out.println();
        System.out.println(sum);


        }
    }

