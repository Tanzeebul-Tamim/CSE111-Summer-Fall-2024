package fall_24.assignments.assignment_5;

// TASK 1
public class Song {
    protected String title;
    protected String artist;
    protected int length;
    
    protected Playlist playlist;
    protected Song nextSong;
    protected int idx;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public void songInfo() {
        System.out.printf("Title: %s\n", this.title);
        System.out.printf("Artist: %s\n", this.artist);
        System.out.printf("Length: %d minutes\n", this.length);
    }
}
