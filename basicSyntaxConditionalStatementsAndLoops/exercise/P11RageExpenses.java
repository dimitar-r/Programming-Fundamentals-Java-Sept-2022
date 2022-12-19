package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = gamesLost / 2;
        int countMouse = gamesLost / 3;
        int countKeyboard = gamesLost / 6;
        int countDisplay = gamesLost / 12;

        double expenses = countHeadset * headsetPrice + countMouse * mousePrice +
                countKeyboard * keyboardPrice + countDisplay * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",expenses);

    }
}