package pbExam;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        int sum = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            sum += numbersList.get(i);
        }
        double average = sum * 1.0 / numbersList.size();
        List<Integer> newList = new ArrayList<>();
        for (Integer currentNumber : numbersList) {
            if (currentNumber > average) {
                newList.add(currentNumber);
            }
        }
        if (newList.isEmpty()) {
            System.out.println("No");
        } else if (newList.size() < 5) {
            for (Integer number : newList) {
                System.out.printf("%d ", number);
            }
        } else {
            newList = newList.stream().limit(5).collect(Collectors.toList());

            for (Integer number : newList) {
                System.out.printf("%d ", number);
            }
        }
    }
}
