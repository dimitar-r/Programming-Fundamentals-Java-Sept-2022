package whileLoop.exercise;

import java.util.Scanner;

public class P2ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxBadGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double sumGrades = 0;
        int countGrades = 0;
        int countBadGrades = 0;
        boolean needABreak = false;
        String lastProblem = "";

        while (!command.equals("Enough")) {
        int grade = Integer.parseInt(scanner.nextLine());
        sumGrades += grade;
        countGrades ++;
        lastProblem = command;

        if (grade <= 4){
            countBadGrades ++;
        }
        if (countBadGrades >= maxBadGrades) {
            needABreak = true;
            break;
        }

            command = scanner.nextLine();
        }
        if (needABreak){
            System.out.printf("You need a break, %d poor grades.", maxBadGrades);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / countGrades);
            System.out.printf("Number of problems: %d%n", countGrades);
            System.out.printf("Last problem: %s",lastProblem);
        }
    }
}
