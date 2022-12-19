package pfExam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheFinalQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequenceList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            if (command.contains("Delete")) {
                int index = Integer.parseInt(command.split(" ")[1] );
                if (index >= 0 && index < sequenceList.size()) {
                    if (index + 1 < sequenceList.size()) {
                        sequenceList.remove(index + 1);
                    }
                }
            } else if (command.contains("Swap")) {
                String word1 = command.split(" ")[1];
                String word2 = command.split(" ")[2];
                if (sequenceList.contains(word1) && sequenceList.contains(word2)) {
                    String newWord1 = word1;
                    String newWord2 = word2;
                    sequenceList.set(sequenceList.indexOf(word1), newWord2);
                    sequenceList.set(sequenceList.indexOf(word2), newWord1);
                }

            } else if (command.contains("Put")) {
                String word = command.split(" ")[1];
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index  >= 0 && index  < sequenceList.size()) {
                        sequenceList.add(index - 1, word);

                } else if (index == sequenceList.size()) {
                    sequenceList.add(word);
                }

            } else if (command.contains("Sort")) {
                sequenceList.sort(Comparator.reverseOrder());

            } else if (command.contains("Replace")) {
                String word1 = command.split(" ")[1];
                String word2 = command.split(" ")[2];
                if (sequenceList.contains(word2)) {
                    sequenceList.set(sequenceList.indexOf(word2), word1 );
                }

            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", sequenceList));
    }
}
