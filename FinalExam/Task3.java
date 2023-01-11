package FinalExam;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> notebook = new LinkedHashMap<>();
        String[] pairOfWordAndDefinition = sc.nextLine().split(" \\| ");

        for (int i = 0; i < pairOfWordAndDefinition.length; i++) {
            String[] seperate = pairOfWordAndDefinition[i].split(": ");
            String name = seperate[0];
            String definition = seperate[1];

            notebook.putIfAbsent(name, new ArrayList<>());
            notebook.get(name).add(definition);

        }
        String[] words = sc.nextLine().split(" \\| ");
        String kindOfTest=sc.nextLine();


        if (kindOfTest.equals("Test")){
            for (int i = 0; i < words.length ; i++) {
                if (notebook.containsKey(words[i])){
                    System.out.printf("%s:%n",words[i]);
                    for (int j = 0; j <notebook.get(words[i]).size() ; j++) {
                        System.out.println("-"+notebook.get(words[i]).get(j));

                    }
                }

            }

        }else if (kindOfTest.equals("Hand Over")){
            for (Map.Entry<String, List<String>> entry : notebook.entrySet()) {
                System.out.print(entry.getKey()+" ");
            }

        }
    }
}
