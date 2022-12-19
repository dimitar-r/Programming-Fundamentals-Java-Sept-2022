package pbExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        int[] waggons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] numbersAsStringArr = new String[waggons.length];
        String[] newArr = new String[waggons.length];
    }
}
