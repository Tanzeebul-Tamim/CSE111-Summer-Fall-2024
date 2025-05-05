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

package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task11;

public class B {
    public static int x;
    public int y = 4;
    public int temp = -5;
    public int sum = 2;

    public B() {
        y = temp + 3;
        sum = 3 + temp + 3;
        temp -= 2;
    }

    @SuppressWarnings("static-access")
    public B(B b) {
        sum = b.sum;
        x = b.x;
        b.methodB(1, 3);
    }

    public void methodA(int m, int n) {
        int x = 2;
        y = y + m + (temp++);
        x = x + 7 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB(int m, int n) {
        int y = 0;
        y = y + this.y;
        x = this.y + 3 + temp;
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y + " " + sum);
    }

    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(3, 2);
        b2.methodB(1, 2);
    }
}

// Outputs:
/*
    7 -15 -7
    -6 -2 -15
    11 -18 -22
    13 1 15
    2 4 21
 */
