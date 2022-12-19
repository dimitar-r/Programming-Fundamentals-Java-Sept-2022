package firstStepsInCodingMoreExercises;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreesCelsius = Double.parseDouble(scanner.nextLine());
        double degreesFahrenheit = degreesCelsius * 1.8 + 32;
        System.out.printf("%.2f",degreesFahrenheit);
    }
}
