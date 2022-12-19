package lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            if (command.equals("Add")){
                int numToAdd = Integer.parseInt(commandArr[1]);
                numbersList.add(numToAdd);
            } else if (command.equals("Remove")) {
                int numToRemove = Integer.parseInt(commandArr[1]);
                numbersList.remove(Integer.valueOf(numToRemove));
            } else if (command.equals("RemoveAt")) {
                int indexToRemove = Integer.parseInt(commandArr[1]);
                numbersList.remove(indexToRemove);
            } else if (command.equals("Insert")) {
                int numToInsert = Integer.parseInt(commandArr[1]);
                int indexToInsert = Integer.parseInt(commandArr[2]);
                numbersList.add(indexToInsert, numToInsert);
            }
            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
//4 19 2 53 6 43
//Add 3
//Remove 2
//RemoveAt 1
//Insert 8 3
//end