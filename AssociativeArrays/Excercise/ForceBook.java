package AssociativeArrays.Excercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {
            if (command.contains(" | ")) {
                String group = command.split("\\s+|\\s+")[0];
                String user = command.split("\\s+|\\s+")[1];


                if (!map.containsKey(group)) {
                    map.put(group, new ArrayList<>());

                }
                boolean isExistUser = false;
                for (List<String> listUsers : map.values()) {
                    if (listUsers.contains(user)) {
                        isExistUser = true;
                    }
                }
                if (!isExistUser) {
                    map.get(group).add(user);
                }

            } else if (command.contains(" -> ")) {

            }
            command = sc.nextLine();
        }
    }
}