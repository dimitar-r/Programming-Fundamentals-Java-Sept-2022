package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> itemsMap = new LinkedHashMap<>();
        itemsMap.put("shards", 0);
        itemsMap.put("fragments", 0);
        itemsMap.put("motes", 0);
        Map<String, Integer> junkMap = new LinkedHashMap<>();
        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int i = 0; i < inputData.length; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String resource = inputData[i + 1].toLowerCase();
                if (resource.equals("shards") || resource.equals("fragments") || resource.equals("motes")) {
                    int currentQuantity = itemsMap.get(resource);
                    itemsMap.put(resource, currentQuantity + quantity);
                } else {
                    if (!junkMap.containsKey(resource)) {
                        junkMap.put(resource, quantity);
                    } else {
                        int current = junkMap.get(resource);
                        junkMap.put(resource, current + quantity);
                    }
                }

                if (itemsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    itemsMap.put("shards", itemsMap.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (itemsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    itemsMap.put("fragments", itemsMap.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (itemsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    itemsMap.put("motes", itemsMap.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }
        }
        itemsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


    }
}
