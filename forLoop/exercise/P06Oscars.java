package forLoop.exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double finalPoints = pointsFromAcademy;

        for (int i = 1; i <= n; i++) {
            String juriName = scanner.nextLine();
            double pointsFromJuri = Double.parseDouble(scanner.nextLine());


            int length = juriName.length();
            double calculatePoints = pointsFromJuri * length / 2;
            finalPoints = finalPoints + calculatePoints;


            if (finalPoints > 1250.5) {
                break;
            }

        }
        if (finalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, finalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - finalPoints);
        }
    }
}
