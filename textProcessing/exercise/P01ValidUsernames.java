package textProcessing.exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        for (String name : usernames) {
            if (isValidUsername(name)) {
                System.out.println(name);
            }
        }
    }

    public static boolean isValidUsername(String username) {
        boolean isValidLength = username.length() >= 3 && username.length() <= 16;
        boolean isValidContent = false;
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return isValidLength;
    }
}
