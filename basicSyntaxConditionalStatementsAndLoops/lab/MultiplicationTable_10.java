package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int times = 1;
        while (times <= 10) {

            System.out.printf("%d X %d = %d%n", n, times, n * times);
            times++;
        }
    }
}
