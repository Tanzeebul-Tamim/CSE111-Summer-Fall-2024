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

package semesters_archives.summer_24.assignments.assignment_6.task9;

public class Test1 {
    public int sum;
    public int y;

    public void methodA() {
        int x = 2, y = 3;
        int[] msg = { 3, 7 };
        y = this.y + msg[0];
        methodB(msg[1]++, msg[0]);
        x = x + this.y + msg[1];
        sum = x + y + msg[0];
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB(int mg2, int mg1) {
        int x = 0;
        y = this.y + mg2;
        x = x + 19 + mg1;
        sum = this.sum + x + y;
        mg2 = y + mg1;
        mg1 = mg2 + x + 2;
        System.out.println(x + " " + y + " " + sum);
    }
}
