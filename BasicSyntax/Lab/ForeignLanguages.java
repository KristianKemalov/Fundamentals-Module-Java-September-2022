package BasicSyntax.Lab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String country= sc.nextLine();

        if (country.equals("USA")|| country.equals("England")){
            System.out.println("English");
        }else if (country.equals("Spain")|| country.equals("Mexico")|| country.equals("Argentina")){
            System.out.println("Spanish");
        }else System.out.println("unknown");
    }
}
