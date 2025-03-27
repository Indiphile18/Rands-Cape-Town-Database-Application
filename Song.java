package za.ac.cput.domain;

public class Song {
    private int songID;
    private String songTitle;
    private int songDuration;
    private String songGenre;
    private String songYear;

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setSongDuration(int songDuration) {
        this.songDuration = songDuration;
    }

    public String getSongYear() {
        return songYear;
    }

    public void setSongYear(String songYear) {
        this.songYear = songYear;
    }

    private Song(Builder builder) {
        this.songID = builder.songID;
        this.songTitle = builder.songTitle;
        this.songDuration = builder.songDuration;
        this.songGenre = builder.songGenre;
        this.songYear = builder.songYear;
    }
    public static class Builder {
        private int songID;
        private String songTitle;
        private int songDuration;
        private String songGenre;
        private String songYear;

        public Builder setSongID(int songID) {
            this.songID = songID;
            return this;
        }

        public Builder setSongTitle(String songTitle) {
            this.songTitle = songTitle;
            return this;
        }

        public Builder setSongDuration(int songDuration) {
            this.songDuration = songDuration;
            return this;
        }

        public Builder setSongGenre(String songGenre) {
            this.songGenre = songGenre;
            return this;
        }

        public Builder setSongYear(String songYear) {
            this.songYear = songYear;
            return this;
        }

        public Song build() {
            return new Song(this);
        }
    }
}






