package MidExam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> deckOfCards = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());


        for (int i = 1; i <= n; i++) {
            String[] input = (sc.nextLine().split(", "));
            if (input[0].equals("Add")) {
                if (deckOfCards.contains(input[1])) {
                    System.out.println("Card is already in the deck");
                } else {
                    deckOfCards.add(input[1]);
                    System.out.println("Card successfully added");
                }

            } else if (input[0].equals("Remove")) {
                if (deckOfCards.contains(input[1])) {
                    deckOfCards.remove(input[1]);
                    System.out.println("Card successfully removed");
                } else {
                    System.out.println("Card not found");
                }

            } else if (input[0].equals("Remove At")) {
                if (isIndexValid(Integer.parseInt(input[1]),deckOfCards)){
                    deckOfCards.remove(Integer.parseInt(input[1]));
                    System.out.println("Card successfully removed");
                }else {
                    System.out.println("Index out of range");
                }


            } else if (input[0].equals("Insert")) {
                if (isIndexValid(Integer.parseInt(input[1]),deckOfCards)){
                    if (deckOfCards.contains(input[2])){
                        System.out.println("Card is already added");
                    }else {
                        deckOfCards.add(Integer.parseInt(input[1]),input[2]);
                        System.out.println("Card successfully added");
                    }
                }else {
                    System.out.println("Index out of range");
                }


            }


        }
        System.out.println(String.join(", ",deckOfCards));
    }

    public static boolean isIndexValid(int index,List<String> deck){
        if (index>=0&&index<=deck.size()-1){
            return true;
        }else {
            return false;
        }

    }
}
