package nestedLoops.lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finalNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isValid = false;
        for (int i = startNum; i <= finalNum; i++) {
            for (int j = startNum; j <= finalNum; j++) {
                count++;
                int sum = i + j;
                if (sum == magicNum) {
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, sum);
                    break;
                }
            }
            if (isValid){
                break;
            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}
