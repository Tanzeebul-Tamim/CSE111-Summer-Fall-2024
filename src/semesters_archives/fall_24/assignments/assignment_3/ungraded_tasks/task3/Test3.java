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

package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task3;

public class Test3 {
    int x = 2, y = 4, sum = 3;
    int arr[] = { x, y, sum };

    public void methodA(int x) {
        arr[0] += methodB(y, this.x) + methodC(x);
        System.out.println(x + " " + this.x + " " + sum);
        arr[1] += this.x * (++y) / (sum % x);
        System.out.println(y + " " + sum + " " + this.x);
        arr[2] += methodC(x) + methodB(this.x, sum);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }

    public int methodB(int q, int n) {
        int arr2[] = { 7, 8 };
        int a = (arr2[0]++) - q;
        int b = (++arr2[1]) - n;
        return a + b;
    }

    public int methodC(int z) {
        z = sum + methodB(x, sum) - z;
        return z / 2;
    }
}
