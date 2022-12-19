package regularExpressions.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "%(?<customerName>[A-z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>[\\d]+)\\|[^|$%.]*?(?<price>[\\d]+\\.?[\\d]+)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalSum = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String customerName = matcher.group("customerName");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double finalSum = quantity * price;
                totalSum += finalSum;
                System.out.printf("%s: %s - %.2f%n", customerName, product, finalSum);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
