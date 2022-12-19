package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> productsPriceMap = new LinkedHashMap<>();
        Map<String, Integer> productsQuantityMap = new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);
            productsPriceMap.put(product, price);
            if (!productsQuantityMap.containsKey(product)) {
                productsQuantityMap.put(product, quantity);
            } else {
                productsQuantityMap.put(product, productsQuantityMap.get(product) + quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productsPriceMap.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsQuantityMap.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
