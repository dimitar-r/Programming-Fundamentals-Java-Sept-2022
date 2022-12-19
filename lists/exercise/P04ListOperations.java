package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int addNumber = Integer.parseInt(command.split("\\s+")[1]);
                numbersList.add(addNumber);

            } else if (command.contains("Insert")) {
                int insertNumber = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValid(index, numbersList)) {
                    numbersList.add(index, insertNumber);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int removeNumberByIndex = Integer.parseInt(command.split("\\s+")[1]);
                if (isValid(removeNumberByIndex, numbersList)) {
                    numbersList.remove(removeNumberByIndex);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                int rotationCount = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= rotationCount; i++) {
                    int firstNum = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNum);
                }

            } else if (command.contains("Shift right")) {
                int rotationCount = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 1; i <= rotationCount; i++) {
                    int lastNumber = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, lastNumber);
                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbersList) {
            System.out.print(number + " ");

        }
    }

    public static boolean isValid(int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
