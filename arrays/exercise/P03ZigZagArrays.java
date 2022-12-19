package arrays.exercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[rows];
        String[] secondArr = new String[rows];

        for (int row = 1; row <= rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNum = numbers[0];
            String secondNum = numbers[1];
            if (row % 2 == 0) {
                firstArr[row - 1] = secondNum;
                secondArr[row - 1] = firstNum;
            } else {
                firstArr[row - 1] = firstNum;
                secondArr[row - 1] = secondNum;
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
