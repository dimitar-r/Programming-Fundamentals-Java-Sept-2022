package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            if (commandArr[0].equals("Add")) {
                int passengers = Integer.parseInt(commandArr[1]);
                wagonsList.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandArr[0]);
                for (int i = 0; i < wagonsList.size(); i++) {
                    int currentWagon = wagonsList.get(i);
                    if (currentWagon + passengersToAdd <= maxCapacity) {
                        wagonsList.set(i, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int wagon : wagonsList) {
            System.out.print(wagon + " ");
        }
    }
}
