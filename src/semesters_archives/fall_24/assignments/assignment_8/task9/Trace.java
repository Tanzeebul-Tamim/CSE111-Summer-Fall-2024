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

package semesters_archives.fall_24.assignments.assignment_8.task9;

class Quiz5 {
    public int sum = 12, x = 2, y = 6;
    public Trace trace;

    public Quiz5(Trace t) {
        trace = t;
        int x = trace.temp + y;
        sum = sum + (t.sum--) + y;
        System.out.println(trace.sum + " " + sum + " " + x);
        sum -= 10;
    }

    public void methodA(int sum, int temp) {
        sum = 3 + sum - trace.sum;
        x = sum + 12 + y;
        y = trace.temp + temp + sum;
        this.sum = y + methodB(trace.temp, trace) + trace.temp;
        System.out.println(sum + " " + y + " " + this.sum);
    }

    public int methodB(int x, Trace temp) {
        int sum = x + temp.sum + this.x;
        temp.temp = sum + this.sum;
        System.out.println(x + " " + temp.temp + " " + sum);
        return sum;
    }
}

public class Trace {
    public int sum, temp;

    public Trace(int sum, int temp) {
        this.sum = sum;
        this.temp = temp;
    }

    public static void main(String[] args) {
        Trace p = new Trace(3, 4);
        Quiz5 q = new Quiz5(p);
        q.methodA(4, 8);
        q.methodA(5, 10);

    }
}

// Outputs:
/*
    2 21 10
    4 40 29
    5 17 86
    40 163 77
    6 56 296
 */