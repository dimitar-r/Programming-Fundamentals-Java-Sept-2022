package forLoop.exercise;

import java.util.Scanner;

public class P00Love {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String showName = scanner.nextLine();
        int countSeasons = Integer.parseInt(scanner.nextLine());
        int countEpisodes = Integer.parseInt(scanner.nextLine());
        double timePerEpisodeNoAdds = Double.parseDouble(scanner.nextLine());
        double timePerEpisode = timePerEpisodeNoAdds + timePerEpisodeNoAdds * 0.20;
        double additionalTimeBonus = countSeasons * 10;
        double allTime = countEpisodes * timePerEpisode * countSeasons + additionalTimeBonus;
        System.out.printf("Total time needed to watch %s series is %.0f", showName, Math.floor(allTime));
    }
}
