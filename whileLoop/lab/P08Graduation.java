package whileLoop.lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        boolean isExcluded = false;
        int poorGradesCount = 0;
        int year = 1;
        double sumGrades = 0;
        while (year <= 12) {
            if (poorGradesCount >= 2) {
                isExcluded = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGradesCount++;
                continue;
            }
            sumGrades += grade;
            year++;
        }
        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrades / 12);
        }
    }
}
