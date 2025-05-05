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

package semesters_archives.summer_24.quiz.lab_quiz.quiz_4;

public class Pirate {
    String name = "empty";
    String level = null;
    int bounty = 0;

    void showPoster() {
        if (this.name.equals("empty")) {
            System.out.println("Add name to show poster");
        } else {
            System.out.printf("%s's Poster:\n", this.name);
            System.out.printf("Pirate's Bounty: %dM berries\n", this.bounty);
            System.out.printf("Pirate's level: %s\n", this.level);
        }
    }

    void awakePower(String cheatCode) {
        if (cheatCode.equals("haki")) {
            System.out.printf("%s's bounty raised by 200M berries\n", this.name);
            this.bounty += 200;
        } else if (cheatCode.equals("dream")) {
            System.out.printf("%s's bounty raised by 3000M berries\n", this.name);
            this.bounty += 3000;
        }
    }
}
