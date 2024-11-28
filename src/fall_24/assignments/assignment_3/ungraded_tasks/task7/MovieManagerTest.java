package fall_24.assignments.assignment_3.ungraded_tasks.task7;

public class MovieManagerTest {
    public static void main(String[] args) {
        Movie inception = new Movie();
        inception.setMovieDetails("Inception", "Christopher Nolan", 8.8);
        System.out.println("1====================");
        inception.addActors("Leonardo DiCaprio", "Joseph Gordon-Levitt");
        inception.addActors("Ellen Page");
        inception.showInfo();
        System.out.println("2====================");
        Movie avengers = new Movie();
        avengers.setMovieDetails("Avengers: Endgame", "Anthony Russo", 8.4);
        avengers.addActors("Robert Downey Jr.", "Chris Evans", "Scarlett Johansson");
        avengers.showInfo();
        System.out.println("3====================");
        Movie parasite = new Movie();
        parasite.setMovieDetails("Parasite", "Bong Joon-ho");
        parasite.addActors("Song Kang-ho", "Choi Woo-shik");
        parasite.updateRating(8.6);
        parasite.showInfo();
        System.out.println("4====================");
        parasite.updateRating(8.9);
        parasite.showInfo();
    }
}
