package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerCardsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPLayerCardsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerCardsList.size() != 0 && secondPLayerCardsList.size() != 0) {
            int firstPlayerCard = firstPlayerCardsList.get(0);
            int secondPlayerCard = secondPLayerCardsList.get(0);
            firstPlayerCardsList.remove(0);
            secondPLayerCardsList.remove(0);
            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCardsList.add(firstPlayerCard);
                firstPlayerCardsList.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPLayerCardsList.add(secondPlayerCard);
                secondPLayerCardsList.add(firstPlayerCard);
            }
        }
        if (firstPlayerCardsList.size() == 0) {
            System.out.printf("Second player wins! Sum: %d ", getCardsSum(secondPLayerCardsList));
        } else if (secondPLayerCardsList.size() == 0) {
            System.out.printf("First player wins! Sum: %d ", getCardsSum(firstPlayerCardsList));
        }
    }

    private static int getCardsSum(List<Integer> cardsList) {
        int sum = 0;
        for (int card : cardsList) {
            sum += card;
        }
        return sum;
    }
}
