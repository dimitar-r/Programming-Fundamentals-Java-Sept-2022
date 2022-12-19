package pfExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class BakeryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> stockMap = new LinkedHashMap<String, Integer>();

        int sum = 0;
        while (!input.equals("Complete")) {
            String command = input.split("\\s+")[0];
            if (command.equals("Receive")) {
                int quantity = Integer.parseInt(input.split("\\s+")[1]);
                String food = input.split("\\s+")[2];
                if (quantity > 0) {
                    stockMap.putIfAbsent(food, quantity);
                    stockMap.put(food, stockMap.get(food) + quantity);
                }
            } else if (command.equals("Sell")) {
                int quantity = Integer.parseInt(input.split("\\s+")[1]);
                String food = input.split("\\s+")[2];

                if (!stockMap.containsKey(food)) {
                    System.out.printf("You do not have any %s.%n", food);
                } else if (quantity > stockMap.get(food)) {
                    System.out.printf("There aren't enough %s. You sold the last %d of them.%n", food, stockMap.get(food));
                    sum += quantity;
                    stockMap.remove(food);
                } else {
                    stockMap.put(food, stockMap.get(food) - quantity);
                    System.out.printf("You sold %d %s.%n", quantity, food);
                    sum += quantity;

                    if (stockMap.get(food) == 0) {
                        stockMap.remove(food);
                    }
                }
            }
            input = scanner.nextLine();
        }
        stockMap.forEach((key, value) -> System.out.println(key + ": " + value));


        System.out.println("All sold: " + sum + " goods");
    }
}
