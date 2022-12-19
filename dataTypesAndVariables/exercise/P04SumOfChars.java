package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int symbol = 1; symbol <= n; symbol++) {
            int code = scanner.nextLine().charAt(0);
            sum += code;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}