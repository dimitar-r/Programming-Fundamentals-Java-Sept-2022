package pfExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int entryIndex = Integer.parseInt(scanner.nextLine());
        String cheapOrExpensive = scanner.nextLine();

    }
}
