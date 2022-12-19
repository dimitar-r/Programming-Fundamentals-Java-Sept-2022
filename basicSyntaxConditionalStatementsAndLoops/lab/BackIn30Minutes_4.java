package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class BackIn30Minutes_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHour = Integer.parseInt(scanner.nextLine());
        int initialMinutes = Integer.parseInt(scanner.nextLine());
        int allMinutes = initialHour * 60 + initialMinutes + 30;
        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;
        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
