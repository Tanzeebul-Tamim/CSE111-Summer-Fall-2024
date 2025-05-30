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

public class TracingTask {
    public static void main(String args[]) {
        Trace m1 = new Trace();
        m1.methodA();
    }
}

class Trace {
    public static int x = 7;
    public static int y = 4;
    public int m = 5;

    @SuppressWarnings("static-access")
    public void methodA() {
        int m = 0, x = 9;
        m = methodB(this.m - 3) + x;
        this.x = ++x;
        System.out.println(this.x + " " + Trace.methodB(m));
    }

    public static int methodB(int y) {
        Trace.y = y * y;
        System.out.println(x + " " + y);
        return x - 11;
    }

}

// Outputs:
/*
    7 2
    10 5
    10 -1
 */
