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

package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task9;

public class Test9 {
    public static void main(String[] args) {
        Tracing t1 = new Tracing(2, 3);
        t1.methodA(1);
        Tracing t2 = new Tracing(3, 4);
        t2.methodA(2);
        t1.methodB(t2);
        t2.methodB(t2);
    }
}

// Outputs:
/*
    2 1 1
    2 6 2
    5 5 3
    5 14 8
    5 -4 8
    5 4 8
 */
