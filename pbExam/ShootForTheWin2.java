package pbExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        int shotCounter = 0;
        while (!input.equals("End")) {

         if (true){
                shotCounter++;
                int index = Integer.parseInt(input);
                int currentNum = numbersArr[index];
                for (int i = 0; i < numbersArr.length; i++) {
                    if (numbersArr[index] < numbersArr[i]) {
                        numbersArr[i] -= currentNum;
                    } else {
                        numbersArr[i] += currentNum;
                    }
                    numbersArr[index] = -1;
                }
            }
            input = scanner.nextLine();
        }
        String[] numbersAsStringArr = new String[numbersArr.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersAsStringArr[i] = String.valueOf(numbersArr[i]);
        }
        System.out.printf("Shot targets: %d -> %s", shotCounter, String.join(" ", numbersAsStringArr));
    }
}
//24 50 36 70
//0
//4
//3
//1
//End