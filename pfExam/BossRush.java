package pfExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "[|](?<boss>[A-Z]{4,})[|][:][#](?<title>[A-Za-z]+[\\s][A-Za-z]+)[#]";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String bossName = matcher.group("boss");
                String title = matcher.group("title");
                int strength = bossName.length();
                int armor = title.length();
                System.out.printf("%s, The %s%n", bossName, title);
                System.out.printf(">> Strength: %d%n", strength);
                System.out.printf(">> Armor: %d%n", armor);
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
