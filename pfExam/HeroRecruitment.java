package pfExam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        Map<String, ArrayList<String>> heroesSpells = new LinkedHashMap<>();
        while (!inputLine.equals("End")) {
            String command = inputLine.split("\\s+")[0];
            if (command.equals("Enroll")) {
                String heroName = inputLine.split("\\s+")[1];
                if (heroesSpells.containsKey(heroName)) {
                    System.out.printf("%s is already enrolled.%n", heroName);
                } else {
                    heroesSpells.putIfAbsent(heroName, new ArrayList<String>());
                }
            } else if (command.equals("Learn")) {
                String heroName = inputLine.split("\\s+")[1];
                String spellName = inputLine.split("\\s+")[2];
                if (!heroesSpells.containsKey(heroName)) {
                    System.out.printf("%s doesn't exist.%n", heroName);
                } else if (heroesSpells.get(heroName).contains(spellName)) {
                    System.out.printf("%s has already learnt %s.%n", heroName, spellName);
                } else {
                    heroesSpells.get(heroName).add(spellName);
                }
            } else if (command.equals("Unlearn")) {
                String heroName = inputLine.split("\\s+")[1];
                String spellName = inputLine.split("\\s+")[2];
                if (!heroesSpells.containsKey(heroName)) {
                    System.out.printf("%s doesn't exist.%n", heroName);
                } else if (!heroesSpells.get(heroName).contains(spellName)) {
                    System.out.printf("%s doesn't know %s.%n", heroName, spellName);
                } else {
                    heroesSpells.get(heroName).remove(spellName);
                }

            }
            inputLine = scanner.nextLine();
        }
        System.out.println("Heroes:");
        heroesSpells.forEach((key, value) -> System.out.println("==" + key + ": " + String.join(", ", value)));
    }
}
