package pbExam;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Generate")) {
            String[] tokens = inputLine.split(">>>");
            String command = tokens[0];
            String substring = "";
            int startIndex = 0;
            int endIndex = 0;
            switch (command) {
                case "Contains":
                    substring = tokens[1];
                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = tokens[1];
                    startIndex = Integer.parseInt(tokens[2]);
                    endIndex = Integer.parseInt(tokens[3]);
                    substring = activationKey.substring(startIndex, endIndex);
                    if (upperOrLower.equals("Upper")) {
                        activationKey = activationKey.replace(substring, substring.toUpperCase());
                    } else {
                        activationKey = activationKey.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(tokens[1]);
                    endIndex = Integer.parseInt(tokens[2]);
                    substring = activationKey.substring(startIndex, endIndex);
                    activationKey = activationKey.replace(substring, "");
                    System.out.println(activationKey);
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}
