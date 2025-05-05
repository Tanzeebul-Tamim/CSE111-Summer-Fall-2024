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

package semesters_archives.summer_24.class_notes.july_03_tracing;

public class Mid {
    public int x;
    public int y;
    public int sum;

    public void setMethod(int[] a) {
        this.x = a[1];
        this.y = a[2];
        this.sum = 100;
    }

    public void methodA(int[] s) {
        this.y += this.sum + this.x;
        this.sum = s[1] + s[2];
        Mid f = new Mid();
        f.setMethod(new int[] { 3, 12, this.x });
        f.sum = this.sum + this.methodB(f);
        System.out.println(this.x + " " + this.y + " " + this.sum);
    }

    public int methodB(Mid n) {
        int y = 7;
        n.x = this.x + this.sum;
        n.sum = n.x + n.y + y;
        System.out.println(n.x + " " + n.y + " " + n.sum);
        return n.x;
    }

    public static void main(String[] args) {
        int[] a = { 2, 7, -2, -5 };
        Mid m = new Mid();
        m.setMethod(a);
        m.methodA(new int[] { -1, 1, -3 });
        System.out.println(m.methodB(m));
    }
}

// Output:
/*
 * 5 7 19
 * 7 105 -2
 * 5 105 117
 * 5
 */
