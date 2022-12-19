package pbExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<foodName>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCalories = 0;
        StringBuilder outputItems = new StringBuilder();

        while (matcher.find()) {
            String foodName = matcher.group("foodName");
            String expDate = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
            outputItems.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n",foodName, expDate, calories));
        }
        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(outputItems);
    }
}
