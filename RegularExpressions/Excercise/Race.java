package RegularExpressions.Excercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> namesParticipants = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());


        String input = sc.nextLine();
        Map<String, Integer> racerDistances = new LinkedHashMap<>();
        namesParticipants.forEach(name -> racerDistances.put(name, 0));
        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigit = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigit);


        while (!input.equals("end of race")) {

            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }
            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }
            if (namesParticipants.contains(racerName.toString())){
                int currentDistance=racerDistances.get(racerName.toString());
                racerDistances.put(racerName.toString(),currentDistance+distance);
            }



            input = sc.nextLine();
        }
        int count=1;

        for (Map.Entry<String,Integer> pair:racerDistances.entrySet()) {
            if (count == 1) {
                System.out.println("1st place: " + pair.getKey());
                count++;
            } else if (count == 2) {
                System.out.println("2nd place: " + pair.getKey());
                count++;
            }else if (count==3){
                System.out.println("3rd place: "+pair.getKey());
                break;
            }
        }
    }
}
