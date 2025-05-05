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

package semesters_archives.fall_24.term_exams.mid_term_exam.oop;

public class Boxer {
    private String name;
    private double weight;
    private int totalMatch;
    private int won;
    private int lost;
    private int fights;
    private String[] opponents;
    private boolean[] results;

    public void updateDetails(String name, double weight, int totalMatch) {
        this.name = name;
        this.weight = weight;
        this.totalMatch = totalMatch;

        this.opponents = new String[this.totalMatch];
        this.results = new boolean[this.totalMatch];

        System.out.printf("%s can fight %d opponents.\n", this.name, this.totalMatch);
    }

    public void showDetails() {
        System.out.printf("Name: %s, Weight: %.2f KG\n", this.name, this.weight);

        if (this.fights == 0) {
            System.out.println("No fights yet.");
        } else {
            System.out.println("Fight history:");

            for (int i = 0; i < fights; i++) {
                String opponent = this.opponents[i];
                String result = this.results[i] ? "Won" : "Lost";

                System.out.printf("vs %s: %s\n", opponent, result);
            }
        }
    }

    public void fight(String opponent, boolean result) {
        if (fights >= totalMatch) {
            System.out.printf("Cannot fight more than %d opponent(s)\n", this.totalMatch);
        } else {
            this.opponents[fights] = opponent;
            this.results[fights] = result;
            this.fights++;

            if (result) {
                this.won++;
            } else {
                this.lost++;
            }
        }
    }

    public void fight(String opponent) {
        fight(opponent, false);
    }

    public String winLossRatio() {
        int w = this.won;
        int l = this.lost;

        while (w != l) {
            if (w < l) {
                int temp = w;
                w = l;
                l = temp;
            }

            w -= l;
        }

        w = this.won / w;
        l = this.lost / l;

        String output = "Career Stats: " + w + ":" + l;
        return output;
    }
}