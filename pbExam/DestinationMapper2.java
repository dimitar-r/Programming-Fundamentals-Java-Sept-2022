package pbExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([=\\/])([A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        List<String> destinationsList = new ArrayList<>();
        int points = 0;
        while (matcher.find()) {
         destinationsList.add(matcher.group(2));
         points += matcher.group(2).length();
        }
        System.out.printf("Destinations: %s%n", String.join(", ",destinationsList));
        System.out.printf("Travel Points: %d", points);

    }
}
