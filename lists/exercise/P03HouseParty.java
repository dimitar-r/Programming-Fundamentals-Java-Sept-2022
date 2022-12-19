package lists.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> guestNames = new ArrayList<>();
        for (int i = 0; i < countCommands; i++) {
            String command = scanner.nextLine();
          String[] commandParts = command.split(" ");
            String name = commandParts[0];
            if (commandParts.length == 3) {
                if (guestNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestNames.add(name);
                }
            }
            else if (commandParts.length == 4) {
                if (guestNames.contains(name)) {
                    guestNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : guestNames) {
            System.out.println(name);
        }
    }
}
