package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations; rotation++) {
            int firstNum = numbersArr[0];
            for (int i = 0; i < numbersArr.length - 1; i++) {
                numbersArr[i] = numbersArr[i + 1];
            }
            numbersArr[numbersArr.length - 1] = firstNum;
        }
        for (int element : numbersArr) {
            System.out.print(element + " ");

        }
    }
}
