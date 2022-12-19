package conditionalStatements.exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int toyTruck = Integer.parseInt(scanner.nextLine());
        double priceToys = puzzles * 2.60 + dolls * 3 + bears * 4.1 + minions * 8.2 + toyTruck * 2;
        int countAllToys = puzzles + dolls + bears + minions + toyTruck;
        if (countAllToys >= 50) {
            priceToys = priceToys - priceToys * 0.25;
        }
        double profit = priceToys - priceToys * 0.10;
        if (profit >= priceExcursion) {
            System.out.printf("Yes! %.2f lv left.",profit - priceExcursion);
        }
        else System.out.printf("Not enough money! %.2f lv needed.",priceExcursion - profit);

    }
}
