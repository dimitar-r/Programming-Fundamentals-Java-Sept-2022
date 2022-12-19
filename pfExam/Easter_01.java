package pfExam;

import java.util.Scanner;

public class Easter_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String commands = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        while (!commands.equals("Easter")) {
            String command = commands.split("\\s+")[0];
            if (command.equals("Replace")) {
                String currentChar = commands.split("\\s+")[1];
                String newChar = commands.split("\\s+")[2];
                input = input.replaceAll(currentChar, newChar);
                System.out.println(input);
            } else if (command.equals("Remove")) {
                String substring = commands.split("\\s+")[1];
                if (input.contains(substring)) {
                    input = input.replace(substring, "");
                }
                System.out.println(input);
            } else if (command.equals("Includes")) {
                String string = commands.split("\\s+")[1];
                if (input.contains(string)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.equals("Change")) {
                String upperLower = commands.split("\\s+")[1];
                if (upperLower.equals("Upper")) {
                    input = input.toUpperCase();
                    System.out.println(input);
                } else if (upperLower.equals("Lower")) {
                    input = input.toLowerCase();
                    System.out.println(input);
                }
            } else if (command.equals("Reverse")) {
                int startIndex = Integer.parseInt(commands.split("\\s+")[1]);
                int endIndex = Integer.parseInt(commands.split("\\s+")[2]);
                if (startIndex >= 0 && endIndex >= 0 && startIndex < input.length() && endIndex < input.length()) {
                    for (int i = endIndex ; i >= startIndex; i--) {
                        sb.append(input.charAt(i));
                    }
                    System.out.println(sb);
                }
            }

            commands = scanner.nextLine();
        }
    }
}
