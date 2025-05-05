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

package semesters_archives.fall_24.class_notes.class_7.tracing;

public class Tracing1 {
    public static void main(String[] args) {
        Test m = new Test();
        m.n = m.m = 5;
        Test n = new Test();
        n.m = m.metA(2);
        n.n = n.metA(4);
        System.out.println(m.n + m.m + " " + n.m + " " + n.n);
    }
}

class Test {
    int m, n = 1;

    int metA(int n) {
        n += m + 3;
        int s = n + this.n;
        if (s % 2 == 0)
            return s;
        Test t = new Test();
        t.n = (++this.m) - (++m) + t.m;
        this.n = n + t.metA(t.m);
        System.out.printf("%d %d %d\n", m, n, s);
        return s + this.n;
    }
}

// Output:
/*
 * 7 10 15
 * 29 34 35
 * 19 29 71
 */