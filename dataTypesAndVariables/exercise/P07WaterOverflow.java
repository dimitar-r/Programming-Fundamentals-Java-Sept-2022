package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int allLiters = 0;
        for (int i = 1; i <= n ; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            allLiters += currentLiters;
            if (allLiters > capacity) {
                System.out.println("Insufficient capacity!");
                allLiters -= currentLiters;
            }
        }
        System.out.println(allLiters);

    }
}
