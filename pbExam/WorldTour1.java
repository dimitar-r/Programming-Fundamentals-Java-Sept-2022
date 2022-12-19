package pbExam;

import java.util.Scanner;

public class WorldTour1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] commandParts = command.split(":");
            if ("Add Stop".equals(commandParts[0])) {
                int index = Integer.parseInt(commandParts[1]);
                String text = commandParts[2];
                if (index >= 0 && index < stringBuilder.length()) {
                    stringBuilder.insert(index, text);
                }
            } else if ("Remove Stop".equals(commandParts[0])) {
                int startIndex = Integer.parseInt(commandParts[1]);
                int endIndex = Integer.parseInt(commandParts[2]);
                if (startIndex >= 0 && startIndex < stringBuilder.length() && endIndex >= 0 && endIndex < stringBuilder.length()) {
                    stringBuilder.delete(startIndex, endIndex + 1);
                }
            } else if ("Switch".equals(commandParts[0])) {
                String oldString = commandParts[1];
                String newString = commandParts[2];
                if (stringBuilder.toString().contains(oldString)) {
                    String newStringNew = stringBuilder.toString().replace(oldString, newString);
                    stringBuilder = new StringBuilder(newStringNew);
                }

            }
            System.out.println(stringBuilder);
            command = scanner.nextLine();
        }
        System.out.print("Ready for world tour! Planned stops: " + stringBuilder);

    }
}
