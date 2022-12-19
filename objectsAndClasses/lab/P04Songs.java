package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04Songs {
    static class Song {
        private String typeList;
        private String name;
        private String length;

        public Song(String typeList, String name, String length) {
            this.typeList = typeList;
            this.name = name;
            this.length = length;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getLength() {
            return length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> listSongs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputSongArr = scanner.nextLine().split("_");
            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);
            listSongs.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
