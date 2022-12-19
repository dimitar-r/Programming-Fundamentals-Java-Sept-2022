package conditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isValid = ((num <= 200 && num >= 100) || num == 0);
        if (!isValid) {
            System.out.println("invalid");
        }
    }
}
