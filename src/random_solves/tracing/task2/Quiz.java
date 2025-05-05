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

package random_solves.tracing.task2;

public class Quiz {
    public static int sum = 7;
    public int y = 3;

    public Quiz(int x, int p) {
        x += 6;
        y = x - p;
        sum = Quiz.sum + method(x, y);
        System.out.println(x + " " + p + " " + sum);
    }

    public void method() {
        int x = 0, y = 0;
        y = y + this.y;
        x = this.y + 2 + sum;
        sum = method(y, x) + this.y;
        System.out.println(x + " " + y + " " + sum);
    }

    public int method(int sum, int x) {
        y += (++sum) + 4;
        x = x - 5;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
        return x;
    }

    public static void main(String[] args) {
        Quiz q1 = new Quiz(3, 2);
        q1.method();
    }
}

// Outputs:
/*
    2 21 33
    9 2 9
    27 47 96
    32 21 74
 */