package BasicSyntax.Excercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user= sc.nextLine();
        String pass="";
        int counter=0;

        for (int position = user.length()-1; position >=0 ; position--) {
            char currentSymbol=user.charAt(position);
            pass+=currentSymbol;
        }
        String enteredPass= sc.nextLine();
        while (!enteredPass.equals(pass)){
            counter++;
            if (counter==4){
                System.out.printf("User %s blocked!",user);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            enteredPass= sc.nextLine();
        }
        if (enteredPass.equals(pass)){
            System.out.printf("User %s logged in.",user);
        }

    }
}
