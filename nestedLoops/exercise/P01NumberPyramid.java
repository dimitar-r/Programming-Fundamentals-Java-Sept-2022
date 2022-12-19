package nestedLoops.exercise;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isBigger = false;
        int number = 1;
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                if (number > n) {
                    isBigger = true;
                    break;
                }
                System.out.print(number + " ");
                number++;

            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
