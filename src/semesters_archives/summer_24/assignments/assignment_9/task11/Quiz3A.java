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

package semesters_archives.summer_24.assignments.assignment_9.task11;

public class Quiz3A {
    public static int temp = 4;
    public static int y;
    public int sum;

    public Quiz3A() {
        int y = 7;
        y = temp - 1;
        sum = Quiz3A.temp + 1 + y;
        temp += 2;
    }

    public Quiz3A(int k) {
        temp = temp++;
        sum = ++temp + k;
        Quiz3A.y = (sum++) - 1;
        System.out.println(Quiz3A.y + " " + temp + " " + y);
    }

    @SuppressWarnings("static-access")
    public int methodB(int m, int n) {
        int x = 0;
        y = this.y + m + (++temp);
        x = x + 2 + n;
        sum = sum + x + y;
        System.out.println(x + " " + this.y + " " + sum);
        return sum;
    }
}
