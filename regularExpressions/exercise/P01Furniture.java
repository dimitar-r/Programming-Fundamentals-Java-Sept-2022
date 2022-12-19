package regularExpressions.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> furnitureTypes = new ArrayList<>();
        double totalSum = 0;
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[\\d]+\\.?[\\d]*)!(?<quantity>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureType = matcher.group("furniture");
                double price = Double.parseDouble( matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnitureTypes.add(furnitureType);
                double currentPrice = price * quantity;
                totalSum += currentPrice;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureTypes.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
