package arrays.exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        for (String elementSecondArr : secondArr) {
            for (String elementFirsArr : firstArr) {
                if (elementSecondArr.equals(elementFirsArr)){
                    System.out.print(elementFirsArr + " ");
                    break;
                }
            }

        }
    }
}
