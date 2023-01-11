package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        String command=sc.nextLine();
        Map<String,String> pieceAndComposer=new LinkedHashMap<>();
        Map<String,String> pieceAndKey=new LinkedHashMap<>();


        for (int i = 1; i <=n ; i++) {
            String piece=command.split("\\|")[0];
            String composer=command.split("\\|")[1];
            String key=command.split("\\|")[2];
            pieceAndComposer.put(piece,composer);
            pieceAndKey.put(piece,key);
            command=sc.nextLine();

        }

        while (!command.equals("Stop")){
            if (command.contains("Add")){
                String currentPiece=command.split("\\|")[1];
                String currentComposer=command.split("\\|")[2];
                String currentKey=command.split("\\|")[3];

                if (pieceAndComposer.containsKey(currentPiece)){
                    System.out.printf("%s is already in the collection!%n",currentPiece);
                }else {
                    pieceAndComposer.put(currentPiece,currentComposer);
                    System.out.printf("%s by %s in %s added to the collection!%n",currentPiece,currentComposer,currentKey);
                    pieceAndKey.put(currentPiece,currentKey);
                }

            }else if (command.contains("Remove")){
                String currentPiece=command.split("\\|")[1];
                if (pieceAndComposer.containsKey(currentPiece)){
                    pieceAndComposer.remove(currentPiece);
                    System.out.printf("Successfully removed %s!%n",currentPiece);
                }else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",currentPiece);
                }

            }else if (command.contains("ChangeKey")){
                String currentPiece=command.split("\\|")[1];
                String newKey=command.split("\\|")[2];

                if (pieceAndKey.containsKey(currentPiece)){
                    pieceAndKey.put(currentPiece,newKey);
                    System.out.printf("Changed the key of %s to %s!%n",currentPiece,newKey);
                }else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.",currentPiece);
                }


            }

            command=sc.nextLine();
        }
        for (Map.Entry<String, String> entry : pieceAndComposer.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue(),pieceAndKey.get(entry.getKey()));
        }

    }
}
