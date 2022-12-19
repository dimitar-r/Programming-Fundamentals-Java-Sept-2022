package forLoop.lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int currentValue = Integer.parseInt(scanner.nextLine());
            if (currentValue < minValue) {
                minValue = currentValue;
            }
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        System.out.printf("Max number: %d%n", maxValue );
        System.out.printf("Min number: %d%n", minValue );
    }
}
