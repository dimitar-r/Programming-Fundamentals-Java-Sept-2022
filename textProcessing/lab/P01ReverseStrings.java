package textProcessing.lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String reverseWord = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                char currentSymbol = input.charAt(i);
                reverseWord += currentSymbol;
            }
            System.out.printf("%s = %s%n", input, reverseWord);
            input = scanner.nextLine();
        }
    }
}
