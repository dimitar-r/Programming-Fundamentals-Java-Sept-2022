package pfExam;

import java.util.Scanner;

public class P01BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCities = Integer.parseInt(scanner.nextLine());
        double profit = 0;
        double totalProfit = 0;

        for (int day = 1; day <= countCities; day++) {
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (day % 3 == 0) {
                expenses += expenses * 0.5;
            }
            if (day % 5 == 0) {
                income -= 0.10 * income;
            }
            profit = income - expenses;
            totalProfit += profit;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);

        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
