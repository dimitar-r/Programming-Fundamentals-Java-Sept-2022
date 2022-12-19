package pfExam;

import java.util.Scanner;

public class SwimmingChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int pointsToCover = Integer.parseInt(scanner.nextLine());
        int countSwimmers = Integer.parseInt(scanner.nextLine());
        double hotelPrice = Double.parseDouble(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double expenses = countSwimmers * days * hotelPrice + countSwimmers * fee;
        double totalPoints = 0;
        for (int i = 1; i <= days; i++) {
            double pointsEarned = Double.parseDouble(scanner.nextLine());
            if (i == 1) {
                totalPoints = pointsEarned;
            } else {
                totalPoints += pointsEarned + pointsEarned * 0.5;
            }
        }
        if (totalPoints >= pointsToCover) {
            System.out.printf("Money left to pay: %.2f BGN.%n", expenses * 0.75);
            System.out.println("The championship was successful!");
        } else {
            System.out.printf("Money left to pay: %.2f BGN.%n", expenses * 0.90);
            System.out.println("The championship was not successful.");
        }

    }
}
