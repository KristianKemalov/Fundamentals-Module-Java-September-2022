package BasicSyntax.Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours=Integer.parseInt(sc.nextLine());
        int mins=Integer.parseInt(sc.nextLine());

        int allmin=(hours*60)+mins+30;

        int diffhours=allmin/60;
        int diffmins=allmin%60;

        if (diffhours>23){
            diffhours=0;
        }
            System.out.printf("%d:%02d",diffhours,diffmins);


    }
}
