package textProcessing.exercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder textBuilder = new StringBuilder(scanner.nextLine());
        int totalPower = 0;
        for (int i = 0; i < textBuilder.length(); i++) {
            char currentSymbol = textBuilder.charAt(i);
            if (currentSymbol == '>') {
                int explosionPower = Integer.parseInt(textBuilder.charAt(i + 1) + "");
                totalPower += explosionPower;
            } else if (totalPower > 0) {
                textBuilder.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }
        System.out.println(textBuilder);
    }
}
