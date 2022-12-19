package pbExam;

import java.util.Scanner;

public class ComputerStore_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = scanner.nextLine();
        double priceWithoutTaxes = 0;
        while (!price.equals("special") && !price.equals("regular")) {
            double priceDouble = Double.parseDouble(price);
            if (priceDouble < 0) {
                System.out.println("Invalid price!");
                price = scanner.nextLine();
                continue;
            }
            priceWithoutTaxes += priceDouble;
            price = scanner.nextLine();
        }
        double taxes = 0.2 * priceWithoutTaxes;
        double totalPrice = 0;
        if (price.equals("special")) {
            totalPrice = (priceWithoutTaxes + taxes) * 0.9;
        } else {
            totalPrice = priceWithoutTaxes + taxes;
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",totalPrice);
        }
    }
}

//Congratulations you've just bought a new computer!
//Price without taxes: 1544.96$
//Taxes: 308.99$
//-----------
//Total price: 1853.95$