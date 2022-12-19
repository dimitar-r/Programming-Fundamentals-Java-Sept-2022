package methods.lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        printTriangle(input);
    }
    public static void printTriangle (int num){
        for (int i = 1; i <= num; i++) {
            prntline(1, i);
        }
        for (int i = num -1; i >= 1 ; i--) {
            prntline(1, i);
        }
    }
    public static void prntline(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
