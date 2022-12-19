package forLoop.exercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int allMoney = 0;
        int toysCount = 0;
        int brother = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                allMoney = allMoney + money;
                brother ++;

            }else {
                toysCount++;
            }

        }
        double sum = toysCount * toyPrice + allMoney - brother;
        if (sum >= washMachinePrice){
            System.out.printf("Yes! %.2f" , sum - washMachinePrice);
        }else {
            System.out.printf("No! %.2f" , washMachinePrice - sum);
        }

    }

}
