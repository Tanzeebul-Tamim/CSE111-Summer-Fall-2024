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

package random_solves.tracing.task3;

@SuppressWarnings("static-access")
class ABC {
    public static int c = 3;
    public int a, b = 5;

    public ABC(int a) {
        this.a = a + b++;
        this.b = 3 * a - this.b;
        this.c = this.a + a;
    }

    public int fun(int b) {
        int a = this.a + c;
        this.b = 4 + this.a;
        System.out.println(a + " " + b + " " + c);
        return c++;
    }
}

@SuppressWarnings("static-access")
class XYZ extends ABC {
    public static int a = 4;
    public int b = 2, c = 7;

    public XYZ(int c) {
        super(c + a);
        this.a = super.b + this.c;
        super.a = 2 + this.c + c;
    }

    public int fun(int a) {
        b = a - 5 + super.fun(ABC.c + c);
        a = this.c + super.c;
        return a + this.a + super.a;
    }
}

@SuppressWarnings("static-access")
public class QuizTest {
    public static void main(String[] args) {
        ABC a = new ABC(4);
        XYZ b = new XYZ(a.a + XYZ.a);
        int x = a.fun(b.a);
        int y = b.fun(XYZ.a);
        int z = XYZ.a - ABC.c;
        System.out.println(x + " " + y + " " + z);
    }
}

// Outputs:
/*
    48 52 39
    62 47 40
    39 122 11
 */