package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int firstIndex = Integer.parseInt(scanner.nextLine());
         int lastIndex = Integer.parseInt(scanner.nextLine());

        for (int code = firstIndex; code <= lastIndex ; code++) {

            System.out.print((char)code + " ");
        }
    }
}
