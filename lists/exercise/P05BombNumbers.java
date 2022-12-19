package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String[] bombNumAndPowerArr = scanner.nextLine().split("\\s+");
        String bombNumber = bombNumAndPowerArr[0];
        int power = Integer.parseInt(bombNumAndPowerArr[1]);
        int sum = 0;

        while (elementsList.contains(bombNumber)){
            int elementIndex = elementsList.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min( elementIndex + power, elementsList.size() - 1);

            for (int i = right; i >= left; i--) {
                elementsList.remove(i);

            }
        }
        System.out.println(elementsList.stream().mapToInt(Integer::parseInt).sum());
    }
}
