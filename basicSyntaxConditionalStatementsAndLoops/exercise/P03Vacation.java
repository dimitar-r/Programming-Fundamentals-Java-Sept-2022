package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double people = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();


        double totalPrice = 1;

        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                totalPrice = 8.45 * people;
            } else if (day.equals("Saturday")) {
                totalPrice = 9.80 * people;
            } else if (day.equals("Sunday")) {
                totalPrice = 10.46 * people;
            }
            if (people >= 30) {
                totalPrice = totalPrice - totalPrice * 0.15;
            }

        } else if (type.equals("Business")) {
            if (people >= 100) {
                people -= 10;
            }
            if (day.equals("Friday")) {
                totalPrice = 10.90 * people;
            } else if (day.equals("Saturday")) {
                totalPrice = 15.60 * people;
            } else if (day.equals("Sunday")) {
                totalPrice = 16 * people;
            }
        } else if (type.equals("Regular")) {
            if (day.equals("Friday")) {
                totalPrice = 15 * people;
            } else if (day.equals("Saturday")) {
                totalPrice = 20 * people;
            } else if (day.equals("Sunday")) {
                totalPrice = 22.50 * people;
            }
            if (people >= 10 && people <= 20) {
                totalPrice = totalPrice - totalPrice * 0.05;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}

