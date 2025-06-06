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

public class Movie {
    private String title;
    private String director;
    private double rating;
    private String[] actors;
    private int actorCount;

    public void setMovieDetails(String title, String director, double rating) {
        setMovieDetails(title, director);
        this.rating = rating;
    }

    public void setMovieDetails(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new String[3];
    }

    public void addActors(String... actors) {
        for (String actor : actors) {
            this.actors[this.actorCount++] = actor;
            System.out.printf("Added actor \"%s\" to \"%s\".\n", actor, this.title);
        }
    }

    public void updateRating(double rating) {
        System.out.printf("Updated rating for \"%s\" to %.1f\n", this.title, rating);
        this.rating = rating;
    }

    public void showInfo() {
        System.out.printf("Title: %s\n", this.title);
        System.out.printf("Director: %s\n", this.director);
        System.out.printf("Rating: %s\n", this.rating);
        System.out.print("Actors: ");

        int count = 0;
        for (String actor : this.actors) {
            if (actor != null) {
                System.out.print(actor);

                if (count != this.actorCount - 1) {
                    System.out.print(", ");
                }

                count++;
            }
        }

        System.out.println();
    }
}
