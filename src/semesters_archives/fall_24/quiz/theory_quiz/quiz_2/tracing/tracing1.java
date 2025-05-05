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

package semesters_archives.fall_24.quiz.theory_quiz.quiz_2.tracing;

public class tracing1 {
    public static void main(String[] args) {
        MidTest p = new MidTest();
        int[] r = { 3, 0, 7 };
        p.method(5, 1);
        p.r = r;
        r[0] = p.method(p.a + p.b);
    }
}

class MidTest {
    int a = 7, b = 6;
    int[] r = { 5, 2 };

    int method(int n) {
        n += b - 1;
        this.b = (++r[(n + b) % 2]) - r[1];
        a = r[0] + r[1];
        System.out.printf("%d %d %d\n", a, b, n);
        return a + this.b;
    }

    void method(int n, int a) {
        r[1] = a + b;
        r[0] += this.r[a] + this.method(r[0]);
        b += this.a - (n++);
        System.out.printf("%d %d %d\n", a, b, n);
    }
}

// Outputs:
/*
    13 -1 10
    1 7 6
    4 0 26
 */