package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().replaceAll(" ","");
        Map<Character, Integer> symbolCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (!symbolCount.containsKey(symbol)) {
                symbolCount.put(symbol, 1);
            } else {
                symbolCount.put(symbol,symbolCount.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
