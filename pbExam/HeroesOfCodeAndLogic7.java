package pbExam;

import java.util.Scanner;

public class HeroesOfCodeAndLogic7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int hero = 1; hero <= countHeroes ; hero++) {
            String heroInfo = scanner.nextLine();
            String[] heroData = heroInfo.split("\\s+");
            String heroName = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);
            if (hp <= 100) {

            }
        }
    }
}
