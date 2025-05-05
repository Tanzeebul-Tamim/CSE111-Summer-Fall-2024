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

package semesters_archives.fall_24.term_exams.final_exam.tracing;

@SuppressWarnings("static-access")
public class A {
    public static int temp = 4;
    public int x = 1, sum = 5, y = 3;

    public A() {
        y = temp - 2;
        sum = (temp--) + 3;
    }

    public void methodB(int a, int b) {
        int y = 0;
        y = y + this.y + a;
        x = y + this.x + temp;
        methodA(temp, b);
        sum = x + y + this.sum;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodA(int temp, int b) {
        int x = 1;
        y = y + b + (this.temp++);
        x = x + 2 + b;
        sum = sum + this.x + y;
        System.out.println(x + " " + y + " " + sum);
    }
}
