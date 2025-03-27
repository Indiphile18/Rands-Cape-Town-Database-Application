package za.ac.cput.factoryTest;

import za.ac.cput.factory.SongFactory;
import za.ac.cput.domain.Song;
import za.ac.cput.factory.Helper;

public class SongTester {
    public static void main(String[] args) {

        Song song = SongFactory.createSong(1, "Thriller", 300, "pop", "2018");


        Helper.printSongDetails(song);
    }
}