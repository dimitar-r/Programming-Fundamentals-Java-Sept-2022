package textProcessing.exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        char firstTimeLetter = input.charAt(0);
        result += firstTimeLetter;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol != firstTimeLetter) {
                result += currentSymbol;
                firstTimeLetter = currentSymbol;
            }
        }
        System.out.println(result);
    }
}
