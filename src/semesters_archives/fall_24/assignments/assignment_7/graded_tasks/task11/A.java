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

package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task11;

public class A {
    public static int temp = 3;

    public int sum;
    public int y;

    public A() {
        y = temp - 1;
        sum = temp + 2;
        temp -= 2;
    }

    public void methodA(int m, int[] n) {
        int x = 0;
        y = y + m + (temp++);
        x = x + 2 + (++n[0]);
        sum = sum + x + y;
        n[0] = sum + 2;
        System.out.println(x + " " + y + " " + sum);
    }
}
// ------------------------------------------
@SuppressWarnings("static-access")
class B extends A {
    public static int x = 1;

    public B() {
        y = temp + 1;
        x = 3 + temp + x;
        temp -= 2;
    }

    public B(B b) {
        sum = b.sum + super.sum;
        x = b.x + x;
    }

    public void methodB(int m, int n) {
        int[] y = { 0 };
        super.y = y[0] + this.y + m;
        x = super.y + 2 + temp - n;
        methodA(x, y);
        sum = x + y[0] + super.sum;
        System.out.println(x + " " + y[0] + " " + sum);
    }
}
// ---------------------------------------------
class Tester {
    public static void main(String[] args) {
        int x[] = { 23 };
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        a1.methodA(1, x);
        b2.methodB(3, 2);
        a1.methodA(1, x);
    }
}

// Outputs:
/*
    26 -2 29
    3 -10 -5
    -5 -3 -13
    34 -4 59
 */