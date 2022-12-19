package pbExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String commands = scanner.nextLine();
        while (!commands.equals("end")) {
            if (commands.contains("swap")) {
                int firstIndex = Integer.parseInt(commands.split(" ")[1]);
                int secondIndex = Integer.parseInt(commands.split(" ")[2]);
                int swappedNum = numbersArr[firstIndex];
                numbersArr[firstIndex] = numbersArr[secondIndex];
                numbersArr[secondIndex] = swappedNum;

            } else if (commands.contains("multiply")) {
                int firstIndex = Integer.parseInt(commands.split(" ")[1]);
                int secondIndex = Integer.parseInt(commands.split(" ")[2]);
                numbersArr[firstIndex] = numbersArr[firstIndex] * numbersArr[secondIndex];
            } else if (commands.contains("decrease")) {
                for (int i = 0; i < numbersArr.length; i++) {
                    numbersArr[i]--;
                }

            }
            commands = scanner.nextLine();
        }
        String[] outputArr = new String[numbersArr.length];
        for (int i = 0; i < outputArr.length; i++) {
            outputArr[i] = String.valueOf(numbersArr[i]);
        }
        System.out.println(String.join(", ", outputArr));


    }
}
