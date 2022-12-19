package arrays.lab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArray.length / 2; i++) {
            String oldElement = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", inputArray));
    }
}
