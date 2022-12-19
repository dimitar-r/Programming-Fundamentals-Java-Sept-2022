package conditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    budget = budget * 0.3;
                    break;
                case "winter":
                    budget = budget * 0.7;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    budget = budget * 0.40;
                    break;
                case "winter":
                    budget = budget * 0.80;
                    break;
            }

        } else {
            destination = "Europe";
            budget = budget * 0.90;
        }
        String place = "";
        if (season.equals("summer")){
            place = "Camp";
        } else {
            place = "Hotel";
        }
        if (destination.equals("Europe")) {
            place = "Hotel";
        }
        System.out.printf("Somewhere in %s%n" ,destination);
        System.out.printf("%s - %.2f", place ,budget );
    }
}
