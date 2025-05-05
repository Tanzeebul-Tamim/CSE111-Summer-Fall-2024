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

package semesters_archives.fall_24.term_exams.mid_term_exam.tracing;

public class MidA {
    public int temp = 3, z = 2, sum;

    public void m1() {
        int x = 3, temp = -1;
        x = sum + 4 + z++;
        temp += this.temp;
        sum = this.temp + m2(sum, x) + this.temp;
        System.out.println(x + " " + temp + " " + sum);
    }

    public int m2(int x, int sum) {
        temp = x;
        int temp = 6;
        temp = ++this.temp + z + this.z;
        x = sum + (temp++) + temp;
        sum = this.sum + x + this.temp;
        System.out.println(x + " " + temp + " " + sum);
        return this.temp--;
    }
}
