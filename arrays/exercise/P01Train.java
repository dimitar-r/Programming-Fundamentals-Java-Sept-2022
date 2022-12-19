package arrays.exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int [] wagonsArray = new int[countWagons];

        for (int i = 0; i < countWagons; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagonsArray[i] = countPeople;
        }

        int sum = 0;
        for (int number : wagonsArray) {
            System.out.printf("%d ",number);
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
