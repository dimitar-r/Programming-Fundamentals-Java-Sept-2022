package pbExam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            if (command.equals("TakeOdd")) {
                password = getCharsAtOddPosition(password);
                System.out.println(password);
            } else if (command.contains("Cut")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);
                String substringToRemove = password.substring(index, index + length);
                password = password.replaceFirst(substringToRemove, "");
                System.out.println(password);
            } else if (command.contains("Substitute")) {
                String substring = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];
                if (password.contains(substring)) {
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);

    }

    private static String getCharsAtOddPosition(String password) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            if (i % 2 != 0) {
                char currentSymbol = password.charAt(i);
                sb.append(currentSymbol);
            }
        }
        return sb.toString();
    }
}
