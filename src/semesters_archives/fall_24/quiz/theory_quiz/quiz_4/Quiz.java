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

package semesters_archives.fall_24.quiz.theory_quiz.quiz_4;

public class Quiz {
    public static int sum = 8;
    public int y = 4;

    public Quiz(int x, int p) {
        x += 5;
        y = x - p;
        sum = Quiz.sum + method(x, y);
        System.out.println(x + " " + y + " " + sum);
    }

    public void method() {
        int x = 0, y = 0;
        y = y + this.y;
        x = this.y + 2 + sum;
        sum = method(y, x) + this.y;
        System.out.println(x + " " + y + " " + sum);
    }

    public int method(int sum, int x) {
        y += (++sum) + 3;
        x = x - 5;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Quiz q1 = new Quiz(2, 1);
        q1.method();
    }
}

// Outputs:
/*
    1 17 26
    7 17 34
    48 38 104
    53 17 142
 */