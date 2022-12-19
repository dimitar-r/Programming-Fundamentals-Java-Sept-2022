package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];

            for (int inIndex = index + 1; inIndex < numbers.length ; inIndex++) {
                int inNumber = numbers[inIndex];

                if (currentNumber + inNumber == magicSum){
                    System.out.println(currentNumber + " " + inNumber);
                }
                
            }

        }
    }
}
