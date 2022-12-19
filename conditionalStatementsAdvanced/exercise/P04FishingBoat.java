package conditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFisherman = Integer.parseInt(scanner.nextLine());
        double shipPrice = 0;


        switch (season) {
            case "Spring":
                shipPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                shipPrice = 4200;
                break;
            case "Winter":
                shipPrice = 2600;


        }
        if (countFisherman <= 6) {
            shipPrice = shipPrice - shipPrice * 0.10;
        } else if (countFisherman <=11) {
            shipPrice = shipPrice - shipPrice * 0.15;
        } else {
            shipPrice = shipPrice - shipPrice * 0.25;
        }
        if (season.equals("Spring") || season.equals("Summer") || season.equals("Winter")) {
            if (countFisherman % 2 == 0){
                shipPrice = shipPrice - shipPrice * 0.05;
            }

        }
        if (budget >= shipPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - shipPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", shipPrice - budget);
        }

    }
}
