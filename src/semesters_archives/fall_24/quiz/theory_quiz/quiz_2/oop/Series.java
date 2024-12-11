package semesters_archives.fall_24.quiz.theory_quiz.quiz_2.oop;

public class Series {
    public String title;
    public int totalEp;
    public String genre;
    public int watched;

    Series() {
        this.title = "[BLANK]";
        this.totalEp = -1;
        this.genre = "NONE";
    }

    public String showDetails() {
        String name = "Show name: " + this.title;
        String ep = "Total Episodes: " + this.totalEp;
        String gen = "Genre: " + this.genre;
        String isWatched = this.watched < totalEp ? "Show is not watched" : "Show is watched";
        String output = name + "\n" + ep + "\n" + gen + "\n" + isWatched;
        return output;
    }

    public void updateInfo(String title, String genre, int totalEp) {
        this.title = title;
        this.genre = genre;
        this.totalEp = totalEp;

        System.out.printf("Updated information for the show: %s\n", this.title);
    }

    public void watchEpisodes(int watched) {
        int remaining = this.totalEp - (this.watched + watched);

        if (remaining <= 0) {
            remaining = this.totalEp - this.watched;
            System.out.printf("Finished show after watching %d episodes of %s\n", remaining, this.title);
            this.watched += remaining;
        } else {
            System.out.printf("Watching %d episodes of %s\n", watched, this.title);
            this.watched += watched;
        }
    }
}
