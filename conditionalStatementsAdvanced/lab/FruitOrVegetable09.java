package conditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class FruitOrVegetable09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        switch (product) {
            case ("banana"):
            case ("apple"):
            case ("kiwi"):
            case ("cherry"):
            case ("lemon"):
            case ("grapes"):
                System.out.println("fruit");
                //tomato, cucumber, pepper и carrottomato, cucumber, pepper и carrot
                break;
            case ("tomato"):
            case ("cucumber"):
            case ("pepper"):
            case ("carrot"):
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;

        }
    }
}
