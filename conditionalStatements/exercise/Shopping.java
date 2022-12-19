package conditionalStatements.exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());
        double videoCardsPrice = videoCards * 250;
        double processorPrice = videoCardsPrice * 0.35 * processors;
        double ramMemoryPrice = videoCardsPrice * 0.10 * ramMemory;
        double totalSum = videoCardsPrice + processorPrice + ramMemoryPrice;
        if (videoCards > processors) {
            totalSum = totalSum - totalSum * 0.15;
        }
        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!",budget - totalSum);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum -budget);
        }
    }
}
