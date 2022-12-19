package pbExam;

import java.util.Scanner;

public class SoftuniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int efficiencyFirst = Integer.parseInt(scanner.nextLine());
        int efficiencySecond = Integer.parseInt(scanner.nextLine());
        int efficiencyThird = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int totalEfficiency = efficiencyFirst + efficiencySecond + efficiencyThird;
        int timeNeeded = 0;
        while (studentsCount > 0) {
            studentsCount -= totalEfficiency;
            timeNeeded++;
            if (timeNeeded % 4 == 0) {
                timeNeeded++;
            }
        }
        System.out.println("Time needed: " + timeNeeded + "h.");
    }
}
