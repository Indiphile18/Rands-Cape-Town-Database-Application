package za.ac.cput.RepositoryTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Song;
import za.ac.cput.factory.SongFactory;
import za.ac.cput.repository.SongRepository;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SongRepositoryTest {
    private SongRepository repository;

    @BeforeEach
    void setUp() {
        repository = new SongRepository();
    }

    @Test
    void addSong_shouldAddSongSuccessfully() {
        Song song = SongFactory.createSong(1, "Thriller", 300, "Pop", "1982");
        repository.addSong(song);

        List<Song> songs = repository.getAllSongs();
        assertEquals(1, songs.size());
        assertEquals("Thriller", songs.getFirst().getSongTitle());
    }

    @Test
    void getSongByID_shouldReturnCorrectSong() {
        Song song1 = SongFactory.createSong(1, "Thriller", 300, "Pop", "1982");

        repository.addSong(song1);
    }

    @Test
    void getSongByID_songNotFound_shouldReturnNull() {
        Song song = repository.getSongByID(99); // ID that does not exist
        assertNull(song);
    }

    @Test
    void removeSong_shouldRemoveSongSuccessfully() {
        Song song = SongFactory.createSong(1, "Thriller", 300, "Pop", "1982");
        repository.addSong(song);

        repository.removeSong(1);
        assertNull(repository.getSongByID(1));
    }

    @Test
    void getAllSongs_shouldReturnAllSongs() {
        repository.addSong(SongFactory.createSong(1, "Thriller", 300, "Pop", "1982"));

        List<Song> songs = repository.getAllSongs();
        assertEquals(1, songs.size());
    }
}
