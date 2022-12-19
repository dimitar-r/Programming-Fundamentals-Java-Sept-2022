package conditionalStatements.exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSecond = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsForOneMeter = Double.parseDouble(scanner.nextLine());
        double seconds = distanceInMeters * secondsForOneMeter;
        double slowDownInSeconds = Math.floor(distanceInMeters / 15) * 12.5;
        double totalSeconds = seconds + slowDownInSeconds;
        if (totalSeconds < recordInSecond) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSeconds);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalSeconds - recordInSecond);
        }
    }
}