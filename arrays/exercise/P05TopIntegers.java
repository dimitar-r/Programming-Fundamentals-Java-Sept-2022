package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index < numbers.length; index++) {
            int currentNum = numbers[index];
            boolean isTop = false;

            if (index == numbers.length - 1) {
                System.out.print(currentNum + " ");
                break;
            }

            for (int i = index + 1; i < numbers.length; i++) {
                if (currentNum > numbers[i]){
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNum + " ");
            }

        }

    }
}
