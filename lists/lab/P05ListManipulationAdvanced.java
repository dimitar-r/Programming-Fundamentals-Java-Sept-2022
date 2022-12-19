package lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");

            if (input.contains("Contains")) {
                int numContains = Integer.parseInt(inputArr[1]);
                if (numbersList.contains(numContains)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }

            } else if (input.contains("Print even")) {
                for (int element : numbersList) {
                    if (element % 2 == 0) {
                        System.out.print(element + " ");
                    }
                }
                System.out.println();

            } else if (input.contains("Print odd")) {
                for (int element : numbersList) {
                    if (element % 2 != 0) {
                        System.out.print(element + " ");
                    }
                }
                System.out.println();

            } else if (input.contains("Get sum")) {
                int sum = 0;
                for (int element : numbersList) {
                    sum += element;
                }
                System.out.println(sum);

            } else if (input.contains("Filter")) {
                int number = Integer.parseInt(inputArr[2]);
                if (inputArr[1].equals("<")) {
                    for (int element : numbersList) {
                        if (element < number) {
                            System.out.print(element + " ");
                        }
                    }
                    System.out.println();
                }
                if (inputArr[1].equals(">")) {
                    for (int element : numbersList) {
                        if (element > number) {
                            System.out.print(element + " ");
                        }
                    }
                    System.out.println();
                }
                if (inputArr[1].equals(">=")) {
                    for (int element : numbersList) {
                        if (element >= number) {
                            System.out.print(element + " ");
                        }
                    }
                    System.out.println();
                }
                if (inputArr[1].equals("<=")) {
                    for (int element : numbersList) {
                        if (element <= number) {
                            System.out.print(element + " ");
                        }
                    }
                    System.out.println();
                }
            }

            input = scanner.nextLine();
        }
    }
}
