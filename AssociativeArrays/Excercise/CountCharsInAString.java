package AssociativeArrays.Excercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text=sc.nextLine();
        Map<Character,Integer> symbolCount=new LinkedHashMap<>();


        for (char symbol:text.toCharArray()) {
            if (symbol==' '){
                continue;
            }
            symbolCount.putIfAbsent(symbol,0);
            symbolCount.put(symbol,symbolCount.get(symbol)+1);

        }


        for (Map.Entry<Character, Integer> entry : symbolCount.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());

        }

    }
}
