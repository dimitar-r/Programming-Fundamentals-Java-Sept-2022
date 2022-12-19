package pfExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> genresList = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());
        String commands = scanner.nextLine();
        while (!commands.equals("Stop!")) {
            if (commands.contains("Join")) {
                String genre = commands.split("\\s+")[1];
                if (!genresList.contains(genre)) {
                    genresList.add(genre);
                }
            } else if (commands.contains("Drop")) {
                String genre = commands.split("\\s+")[1];
                if (genresList.contains(genre)) {
                    genresList.remove(genre);
                }
            } else if (commands.contains("Replace")) {
                String oldGenre = commands.split("\\s+")[1];
                String newGenre = commands.split("\\s+")[2];
                if (genresList.contains(oldGenre) && !genresList.contains(newGenre)) {
                    int index = genresList.indexOf(oldGenre);
                    genresList.remove(index);
                    genresList.add(index, newGenre);
                }
            } else if (commands.contains("Prefer")) {
                int index1 = Integer.parseInt(commands.split("\\s+")[1]);
                int index2 = Integer.parseInt(commands.split("\\s+")[2]);
                if (index1 > 0 && index1 <= genresList.size() && index2 > 0 && index2 <= genresList.size()) {
                    String genre1 = genresList.get(index1);
                    String genre2 = genresList.get(index2);
                    genresList.set(index1, genre2);
                    genresList.set(index2, genre1);
                }
            }
            commands = scanner.nextLine();
        }
        System.out.println(String.join(" ", genresList));
    }
}
