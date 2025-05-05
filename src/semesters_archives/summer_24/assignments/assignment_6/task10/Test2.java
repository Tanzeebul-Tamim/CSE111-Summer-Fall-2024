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

package semesters_archives.summer_24.assignments.assignment_6.task10;

public class Test2 {
    int x = 3, y = 1, z = -4;
    double p = 2.5;

    public void methodA(int n, int x) {
        this.x = methodB(x, n);
        p = this.x + n % x * 2.0;
        y = (z++) + methodB(z, (int) p) + (++z);
        System.out.println(this.x + " " + (n + y) + " " + (x + z));
    }

    public int methodB(int q, int n) {
        int arr[] = { 2, -5, 6 };
        arr[0] = arr[2] - this.x + n;
        arr[1] = q - arr[1];
        arr[2] = arr[q % 3] + arr[n % 2];
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        return arr[1] + arr[2] - arr[0];
    }
}
