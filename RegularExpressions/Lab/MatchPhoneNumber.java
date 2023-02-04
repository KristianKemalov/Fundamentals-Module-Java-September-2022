package RegularExpressions.Lab;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();

        String regex="\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);
        List<String> numbers=new ArrayList<>();
        while (matcher.find()){
            numbers.add(matcher.group());
       }
        System.out.println(String.join(", ",numbers));
    }
}
