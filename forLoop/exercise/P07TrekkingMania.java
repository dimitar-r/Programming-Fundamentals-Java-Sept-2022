package forLoop.exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int climbMusala = 0;
        int climbMontblanc = 0;
        int climbKilimanjaro = 0;
        int climbK2 = 0;
        int climbEverest = 0;
        int allPeople = 0;
        for (int i = 1; i <= n; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            allPeople = allPeople + countPeople;

            if (countPeople <= 5) {
                climbMusala = climbMusala + countPeople;
            } else if (countPeople <= 12) {
                climbMontblanc = climbMontblanc + countPeople;
            } else if (countPeople <= 25) {
                climbKilimanjaro = climbKilimanjaro + countPeople;
            }else if (countPeople <= 40) {
                climbK2 = climbK2 + countPeople;
            }else {
                climbEverest = climbEverest + countPeople;
            }

        }
        System.out.printf("%.2f%%%n",climbMusala * 1.00 / allPeople * 100);
        System.out.printf("%.2f%%%n",climbMontblanc * 1.00 / allPeople * 100);
        System.out.printf("%.2f%%%n",climbKilimanjaro * 1.00 / allPeople * 100);
        System.out.printf("%.2f%%%n",climbK2 * 1.00 / allPeople * 100);
        System.out.printf("%.2f%%%n",climbEverest * 1.00 / allPeople * 100);


    }
}
