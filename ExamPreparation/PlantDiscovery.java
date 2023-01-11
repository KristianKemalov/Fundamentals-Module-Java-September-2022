package ExamPreparation;

import com.sun.source.tree.IfTree;

import java.net.DatagramPacket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> plantRarityMap = new HashMap<>();
        Map<String, Double> plantRatingMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);

            plantRarityMap.put(plant, rarity);
            plantRatingMap.put(plant, 0.0);


        }
        String inputLine = sc.nextLine();
        while (!inputLine.equals("Exhibition")) {
            String[] tokens = inputLine.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];


            if (!plantRarityMap.containsKey(plant)) {
                System.out.println("error");
            } else {

                if (command.equals("Rate")) {

                   double value = Double.parseDouble(tokens[2]);
                    if (plantRatingMap.get(plant) == 0) {
                        plantRatingMap.put(plant, value);
                    } else {
                        double newRate=(plantRatingMap.get(plant)+value)/2;
                        plantRatingMap.put(plant,newRate);

                    }
                } else if (command.equals("Update")) {
                    int rarity = Integer.parseInt(tokens[2]);
                    plantRarityMap.put(plant,rarity);

                } else if (command.equals("Reset")) {
                    plantRatingMap.put(plant,0.0);

                }


            }

            inputLine = sc.nextLine();

        }
        System.out.println("Plants for the exhibition");
        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            System.out.printf("%s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),plantRatingMap.get(entry.getKey()));

            
        }

    }
}
