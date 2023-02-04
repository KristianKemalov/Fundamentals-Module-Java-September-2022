package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {

        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;

        }

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Song> listSongs = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] inputSongArr = input.split("_");

            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            listSongs.add(currentSong);

        }


        String command = sc.nextLine();

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
