package forLoop.lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int currentSum = Integer.parseInt(scanner.nextLine());
            leftSum += currentSum;

        }
        for (int i = 1; i <= n; i++) {
            int currentSum = Integer.parseInt(scanner.nextLine());
            rightSum += currentSum;

        }
        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
