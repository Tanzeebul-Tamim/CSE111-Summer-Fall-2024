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
