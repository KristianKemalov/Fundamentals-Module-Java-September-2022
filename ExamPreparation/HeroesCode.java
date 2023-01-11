package ExamPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String info = sc.nextLine();
            String[] heroData = info.split("\\s+");
            String name = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);

            if (hp <= 100) {
                heroesHP.put(name, hp);
            }
            if (mp <= 200) {
                heroesMP.put(name, mp);
            }
        }
        String command = sc.nextLine();
        while (!command.equals("End")) {
            String[] commandArr = command.split(" - ");
            String type = commandArr[0];

            if (type.equals("CastSpell")) {
                int mpNeed = Integer.parseInt(commandArr[2]);
                String spellName = commandArr[3];
                String name = commandArr[1];

                if (mpNeed <= heroesMP.get(name)) {
                    heroesMP.put(name, heroesMP.get(name) - mpNeed);

                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, heroesMP.get(name));
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                }
            } else if (type.equals("TakeDamage")) {
                String name = commandArr[1];
                String attacker = commandArr[3];
                int damage = Integer.parseInt(commandArr[2]);

                heroesHP.put(name, heroesHP.get(name) - damage);
                if (heroesHP.get(name) > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, heroesHP.get(name));
                } else {
                    System.out.printf("%s has been killed by %s!%n", name, attacker);
                    heroesHP.remove(name);
                }

            } else if (type.equals("Recharge")) {
                String name = commandArr[1];
                int charge = Integer.parseInt(commandArr[2]);
                int currentMp = heroesMP.get(name);
                currentMp += charge;
                if (currentMp > 200) {
                    currentMp = 200;
                }
                System.out.printf("%s recharged for %d MP!%n", name, currentMp - heroesMP.get(name));
                heroesMP.put(name, currentMp);

            } else if (type.equals("Heal")) {
                String name = commandArr[1];
                int charge = Integer.parseInt(commandArr[2]);
                int currentHp = heroesHP.get(name);
                currentHp += charge;
                if (currentHp > 100) {
                    currentHp = 100;
                }
                System.out.printf("%s healed for %d HP!%n", name, currentHp - heroesHP.get(name));
                heroesHP.put(name, currentHp);

            }
            command = sc.nextLine();
        }

        for (Map.Entry<String, Integer> entry : heroesHP.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.printf("%s%n", entry.getKey());

                System.out.printf("  HP: %d%n", entry.getValue());
                System.out.printf("  MP: %d%n", heroesMP.get(entry.getKey()));
            }
        }


    }
}
