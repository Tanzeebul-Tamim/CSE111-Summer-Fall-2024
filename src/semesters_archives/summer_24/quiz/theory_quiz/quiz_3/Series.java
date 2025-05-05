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

package semesters_archives.summer_24.quiz.theory_quiz.quiz_3;

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
