package regularExpressions.exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namesParticipants = scanner.nextLine();
        List<String> namesList = Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());
        Map<String, Integer> racerDistancesMap = new LinkedHashMap<>();
        namesList.forEach(name-> racerDistancesMap.put(name, 0));
        String regexLetters = "[A-Za-z]+";
        Pattern  patternLetters = Pattern.compile(regexLetters);
        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);
        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }
            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }
            if (namesList.contains(racerName.toString())) {
                int currentDistance = racerDistancesMap.get(racerName.toString());
                racerDistancesMap.put(racerName.toString(), currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        List<String> topThreeNames = racerDistancesMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .map(entry->entry.getKey())
                .collect(Collectors.toList());
        System.out.println("1st place: " + topThreeNames.get(0));
        System.out.println("2nd place: " + topThreeNames.get(1));
        System.out.println("3rd place: " + topThreeNames.get(2));

    }
}
