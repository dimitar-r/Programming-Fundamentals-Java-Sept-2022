package pfExam;

import java.util.Scanner;

public class ArrivingInKathmandu_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("Last note")) {
            input = scanner.nextLine();
        }
    }
}
