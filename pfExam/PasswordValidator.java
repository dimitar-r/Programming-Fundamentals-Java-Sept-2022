package pfExam;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Complete")) {
            if (inputLine.contains("Upper")) {
                int index = Integer.parseInt(inputLine.split("\\s+")[2]);
                String substring = password.substring(index, index + 1);
                password = password.replace(substring,substring.toUpperCase());
                System.out.println(password);
            } else if (inputLine.contains("Lower")) {
                int index = Integer.parseInt(inputLine.split("\\s+")[2]);
                String substring = password.substring(index, index + 1);
                password = password.replace(substring,substring.toLowerCase());
                System.out.println(password);
            } else if (inputLine.contains("Insert")) {
                int index = Integer.parseInt(inputLine.split("\\s+")[1]);
                if (index < 0 || index > password.length()) {
                    continue;
                }
                String symbol = inputLine.split("\\s+")[2];
                String firstPart = password.substring(0, index);
                String secondPart = password.substring(index);
                password = firstPart + symbol + secondPart;
            } else if (inputLine.contains("Replace")) {

            } else if (inputLine.contains("Validation")) {

            }
            inputLine = scanner.nextLine();
        }


    }
}
