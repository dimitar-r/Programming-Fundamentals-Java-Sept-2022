package pbExam;

import java.util.Scanner;

public class AndProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countEmployees = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        double allEmployeesAllHours = countEmployees * workingDays * 8;
        double processorsMade = Math.floor(allEmployeesAllHours / 3);
        double losses = 0;
        double profit = 0;
        if (processorsMade < countProcessors){
            losses = (countProcessors - processorsMade) * 110.10;
            System.out.printf("Losses: -> %.2f BGN",losses);
        } else {
            profit = (processorsMade - countProcessors) * 110.10;
            System.out.printf("Profit: -> %.2f BGN",profit);
        }
    }
}
