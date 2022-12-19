package pbExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elementsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int numberOfMoves = 0;
        while (!input.equals("end")) {
            numberOfMoves++;
            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);
            if (firstIndex < 0 || secondIndex < 0 || firstIndex >= elementsList.size() || secondIndex >= elementsList.size() || firstIndex == secondIndex) {
                System.out.println("Invalid input! Adding additional elements to the board");
                String numToAdd = "-" + numberOfMoves + "a";
                elementsList.add(elementsList.size() / 2, numToAdd);
                elementsList.add(elementsList.size() / 2, numToAdd);
            } else if (elementsList.get(firstIndex).equals(elementsList.get(secondIndex))) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", elementsList.get(firstIndex));
                elementsList.remove(firstIndex);
                if (secondIndex - 1 < 0) {
                    elementsList.remove(secondIndex);
                } else {
                    elementsList.remove(secondIndex - 1);
                }
            } else {
                System.out.println("Try again!");
            }
            if (elementsList.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", numberOfMoves);
                break;
            }
            input = scanner.nextLine();
        }
        if (elementsList.size() > 0) {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elementsList));
        }

    }
}

