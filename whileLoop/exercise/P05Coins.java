package whileLoop.exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double changeInCoins = Math.round(change * 100);
        int coinCounter = 0;
        while (changeInCoins > 0) {
            if (changeInCoins >= 200) {
                changeInCoins -= 200;
                coinCounter++;
            } else if (changeInCoins >= 100) {
                changeInCoins -= 100;
                coinCounter++;

            } else if (changeInCoins >= 50) {
                changeInCoins -= 50;
                coinCounter++;

            } else if (changeInCoins >= 20) {
                changeInCoins -= 20;
                coinCounter++;

            } else if (changeInCoins >= 10) {
                changeInCoins -= 10;
                coinCounter++;

            } else if (changeInCoins >= 5) {
                changeInCoins -= 5;
                coinCounter++;

            } else if (changeInCoins >= 2) {
                changeInCoins -= 2;
                coinCounter++;

            } else if (changeInCoins >= 1) {
                changeInCoins -= 1;
                coinCounter++;

            }
        }
        System.out.printf("%d",coinCounter);
    }
}
