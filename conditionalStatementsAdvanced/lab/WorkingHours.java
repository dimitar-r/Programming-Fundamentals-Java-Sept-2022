package conditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        if (num >= 10 && num <= 18 && !day.equals("Sunday")){
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
