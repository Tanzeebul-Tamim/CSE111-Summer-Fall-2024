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

package semesters_archives.fall_24.class_notes.class_13.tracing;

public class TracingStatic {
    public static void main(String args[]) {
        int temp = 35;
        A a1 = new A();
        A a2 = new A(-5, -7);
        a1.methodA(1, temp);
        a2.methodA(1, A.temp);
        
    }
}

class A {
    public static int temp = 3;
    public static int sum = 9;
    public int y = 4, x = 0;

    public A() {
        int sum = 7;
        y = temp - 5;
        sum = temp + 2;
        temp -= 2;
        this.x = sum + temp + y;
    }

    public A(int y, int temp) {
        y = temp - 1 + x;
        sum = temp + 2 - x;
        temp -= 2;
    }

    public void methodA(int m, int n) {
        int x = 0;
        y = y + m + methodB(x, m);
        x = this.x + 2 + (++n);
        sum = sum + x + y;
        n = sum + 2;
        System.out.println(n + " " + y + " " + sum);
    }

    @SuppressWarnings("static-access")
    public int methodB(int m, int n) {
        int temp = 0;
        this.y = temp + this.y + m;
        x = this.y + 2 + temp - n;
        sum = x + temp + this.sum;
        System.out.println(temp + " " + temp + " " + sum);
        return temp;
    }
}

// Outputs:
/*
    0 0 -6
    32 -1 30
    0 0 35
    51 5 49
 */