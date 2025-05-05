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

package semesters_archives.summer_24.assignments.assignment_4.task10;

public class Test10 {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();
        h1.age = 21;
        h1.height = 5.5;
        System.out.println(h1.age);
        System.out.println(h1.height);
        h2.height = h1.height - 3;
        System.out.println(h2.height);
        h2.age = h1.age++;
        System.out.println(h1.age);
        h2 = h1;
        System.out.println(h2.age);
        System.out.println(h2.height);
        h2.age++;
        h2.height++;
        System.out.println(h1.age);
        System.out.println(h1.height);
        h1.age = ++h2.age;
        System.out.println(h2.age);
        System.out.println(h2.height);
    }
}

// Output:
/*
 * 21
 * 5.5
 * 2.5
 * 22
 * 22
 * 5.5
 * 23
 * 6.5
 * 24
 * 6.5
 */