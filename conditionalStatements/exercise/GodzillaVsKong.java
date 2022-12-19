package conditionalStatements.exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras  = Integer.parseInt(scanner.nextLine());
        double extrasClothes = Double.parseDouble(scanner.nextLine());
        double decors = 0.10 * budget;
        double priceForClothes = extrasClothes * extras;
        if (extras > 150) {
            priceForClothes = priceForClothes - 0.10 * priceForClothes;
        }
        double moneyForTheMovie = decors + priceForClothes;
        double result = budget - moneyForTheMovie;
        if (moneyForTheMovie > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",moneyForTheMovie - budget);
        }
        else System.out.printf("Action!%nWingard starts filming with %.2f leva left.",budget - moneyForTheMovie);
    }
}
