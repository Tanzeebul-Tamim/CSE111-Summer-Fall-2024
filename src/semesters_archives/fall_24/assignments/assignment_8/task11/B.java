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

package semesters_archives.fall_24.assignments.assignment_8.task11;

@SuppressWarnings("static-access")
public class B extends A {
    public static int x = 1;

    public B() {
        super(5);
        sum = 2;
        y = A.temp + 1;
        B.x = 3 + temp + B.x;
        A.temp -= 2;
    }

    public B(B b) {
        super(2);
        sum = 3;
        this.sum = sum + this.sum % 2 + 2;
        B.x = b.x + B.x;
    }

    public void methodB(int m, int n) {
        int[] y = { 2, 3 };
        this.y = y[0] + this.y + m;
        B.x = this.y + 2 + A.temp - n;
        methodA(B.x, y);
        this.sum = B.x + y[1] + this.sum;
        System.out.println(B.x + " " + (y[0] + y[1]) + " " + this.sum);
    }
}
