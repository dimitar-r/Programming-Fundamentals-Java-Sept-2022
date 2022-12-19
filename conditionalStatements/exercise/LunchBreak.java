package conditionalStatements.exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String showName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());
        double timeForLunch = breakDuration / 8.0;
        double timeForRelax = breakDuration / 4.0;
        double timeLeft = breakDuration - timeForLunch - timeForRelax;
        double difference = Math.abs(timeLeft - episodeDuration);
        if (timeLeft >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",showName,Math.ceil(difference));
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",showName,Math.ceil(difference));
        }
    }
}
