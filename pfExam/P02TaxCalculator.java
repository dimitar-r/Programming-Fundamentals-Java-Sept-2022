package pfExam;

import java.util.Scanner;

public class P02TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehicleType = scanner.nextLine().split(">>");
        int tax = 0;
        double totalTax = 0;
        for (String element : vehicleType) {
            int years = Integer.parseInt(element.split(" ")[1]);
            int km = Integer.parseInt(element.split(" ")[2]);

            if (element.contains("family")) {
                tax = (km / 3000) * 12 + (50 - years * 5);
                totalTax += tax;
            } else if (element.contains("heavyDuty")) {
                tax = (km / 9000) * 14 + (80 - years * 8);
                totalTax += tax;
            } else if (element.contains("sports")) {
                tax = (km / 2000) * 18 + (100 - years * 9);
                totalTax += tax;
            } else {
                System.out.println("Invalid car type.");
                continue;
            }
            String carType = element.split(" ")[0];
            System.out.printf("A %s car will pay %d.00 euros in taxes.%n", carType, tax);

        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",totalTax);
    }
}
//family 3 7210>>van 4 2345>>heavyDuty 9 31000>>sports 4 7410