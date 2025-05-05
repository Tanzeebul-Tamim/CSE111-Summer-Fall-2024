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

package semesters_archives.summer_24.assignments.assignment_7.task9;

public class Trace1 {
    public int[] q;
    public int x, y;

    public Trace1(int[] p) {
        this.q = p;
        System.out.println(q[1] + " " + q[2] + " " + q[3]);
    }

    public int m2(int a, int b) {
        x = b++;
        y = ++a / x;
        q[x] = b + q[x];
        if (b % 2 == 0) {
            q[b] = x;
            System.out.println(q[a] + " " + y + " " + x);
            this.m1(b, a);
        } else {
            System.out.println(x + " " + y + " " + q[x]);
        }
        return x + y;
    }

    public void m1(int x, double y) {
        this.y = (int) y;
        System.out.println(q[x] + " " + (++x) + " " + y);
        m2(this.y, x - 1);
    }
}
