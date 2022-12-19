package conditionalStatements.exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());
        int timeTotal = timeFirst + timeSecond + timeThird;
        int minutes = timeTotal / 60;
        int seconds = timeTotal % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d",minutes,seconds);
        } else
            System.out.printf("%d:%d",minutes,seconds);
    }
}
