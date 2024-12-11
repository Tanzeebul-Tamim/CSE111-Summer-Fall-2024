package summer_24.quiz.theory_quiz.quiz_3;

public class Series {
    String title = "[BLANK]";
    private int ep = -1;
    int watched = 0;
    private String genre = "NONE";

    String showDetails() {
        String name = "Show name: " + this.title;
        String totalEp = "Total Episodes: " + this.ep;
        String showGen = "Genre: " + this.genre;
        String isWatched = this.ep > this.watched ? "Show is not watched." : "Show is watched.";
        String result = name + "\n" + totalEp + "\n" + showGen + "\n" + isWatched;

        return result;
    }

    void updateInfo(String title, String genre, int ep) {
        this.title = title;
        this.genre = genre;
        this.ep = ep;

        System.out.printf("Updated information for the show: %s\n", this.title);
    }

    void watchEpisodes(int watched) {
        int remaining = this.ep - this.watched;

        if (remaining > watched) {
            this.watched += watched;
            System.out.printf("Watching %d episodes of %s\n", watched, this.title);
        } else {
            this.watched += remaining;
            System.out.printf("Finished show after watching %d episodes of %s\n", remaining, this.title);
        }
    }
}
