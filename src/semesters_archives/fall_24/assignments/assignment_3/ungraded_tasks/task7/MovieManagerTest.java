/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task7;

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
