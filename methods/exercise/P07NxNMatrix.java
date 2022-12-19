package methods.exercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            printMatrix(number);
    }

    public static void printMatrix(int number) {
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number ; col++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
