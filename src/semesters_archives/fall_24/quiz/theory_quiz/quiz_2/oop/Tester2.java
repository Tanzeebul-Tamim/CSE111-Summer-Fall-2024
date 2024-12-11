package semesters_archives.fall_24.quiz.theory_quiz.quiz_2.oop;

/*
    Carefully observe the following driver code and expected output to design the Series class.

    Here, each series object keeps track of total episodes and number of watched episodes to determine whether a series has been watched completely or not.

    EXPECTED OUTPUT:

    ========1========
    Show name: [BLANK]
    Total Episodes: -1
    Genre: NONE
    Show is watched
    Updated information for the show: Wednesday
    Show name: Wednesday
    Total Episodes: 15
    Genre: Mystery, Supernatural
    Show is not watched
    ========2========
    Updated information for the show: Dark
    Show name: Dark
    Total Episodes: 10
    Genre: Sci-fi
    Show is not watched
    ========3========
    Watching 10 episodes of Wednesday
    Finished show after watching 10 episodes of Dark
    Updated information for the show: Suits
    ========4========
    Show name: Suits
    Total Episodes: 20
    Genre: Comedy, Courtroom
    Show is not watched
    Watching 2 episodes of Wednesday
    You have watched 12 episodes of Wednesday
    Watching 15 episodes of Suits
    Finished show after watching 3 episodes of Wednesday
    ========5========
    Show name: Wednesday
    Total Episodes: 15
    Genre: Mystery, Supernatural
    Show is watched
    Show name: Dark
    Total Episodes: 10
    Genre: Sci-fi
    Show is watched
    Show name: Suits
    Total Episodes: 20
    Genre: Comedy, Courtroom
    Show is not watched
    ========6========
 */

public class Tester2 {
    public static void main(String[] args) {
        Series s1 = new Series();
        System.out.println("========1========");
        System.out.println(s1.showDetails());
        s1.updateInfo("Wednesday", "Mystery, Supernatural", 15);
        System.out.println(s1.showDetails());
        System.out.println("========2========");
        Series s2 = new Series();
        s2.updateInfo("Dark", "Sci-fi", 10);
        System.out.println(s2.showDetails());
        System.out.println("========3========");
        s1.watchEpisodes(10);
        s2.watchEpisodes(10);
        Series s3 = new Series();
        s3.updateInfo("Suits", "Comedy, Courtroom", 20);
        System.out.println("========4========");
        System.out.println(s3.showDetails());
        s1.watchEpisodes(2);
        System.out.println("You have watched " + s1.watched + " episodes of " + s1.title);
        s3.watchEpisodes(15);
        s1.watchEpisodes(6);
        System.out.println("========5========");
        System.out.println(s1.showDetails());
        System.out.println(s2.showDetails());
        System.out.println(s3.showDetails());
        System.out.println("========6========");
    }
}
