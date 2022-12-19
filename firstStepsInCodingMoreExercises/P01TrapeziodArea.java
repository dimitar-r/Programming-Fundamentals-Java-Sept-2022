package firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P01TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basicOne = Double.parseDouble(scanner.nextLine());
        double basicTwo = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = (basicOne + basicTwo) * height / 2;
        System.out.printf("%.2f",area);
    }
}
