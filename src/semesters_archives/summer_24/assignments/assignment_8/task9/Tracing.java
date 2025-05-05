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

package semesters_archives.summer_24.assignments.assignment_8.task9;

public class Tracing {
    public static int x = 0, y = 0;
    public int a, b;

    public Tracing(int a, int b) {
        this.a = a;
        this.b = b;
        x += 1;
        y += 2;
    }

    public void methodA(int a) {
        this.a = x + a;
        this.b = this.b + this.a + this.methodB();
        System.out.println(this.a + " " + this.b + " " + x);
    }

    public int methodB() {
        this.b = y - this.b + this.a;
        System.out.println(this.a + " " + this.b + " " + x);
        x += this.b;
        return this.b;
    }

    @SuppressWarnings("static-access")
    public void methodB(Tracing t1) {
        t1.b = this.y - t1.b + this.b;
        System.out.println(t1.a + " " + t1.b + " " + x);
    }
}
