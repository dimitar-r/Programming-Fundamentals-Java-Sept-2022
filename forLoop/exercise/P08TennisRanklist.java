package forLoop.exercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        double pointsFromTour = 0;
        int winCount = 0;

        for (int i = 1; i <= n; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    points = points + 2000;
                    pointsFromTour = pointsFromTour + 2000;
                    winCount++;
                    break;
                case "F":
                    points = points + 1200;
                    pointsFromTour = pointsFromTour + 1200;
                    break;
                case "SF":
                    points = points + 720;
                    pointsFromTour = pointsFromTour + 720;
                    break;

            }

        }
            double averagePoints = pointsFromTour / n;
            double winRate = winCount * 1.00 / n * 100;
            System.out.printf("Final points: %d%n", points);
            System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
            System.out.printf("%.2f%%", winRate);

    }
}
