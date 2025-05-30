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

package semesters_archives.summer_24.assignments.assignment_5.task7;

public class Reader_tester {
    public static void main(String[] args) {
        Reader r1 = new Reader();
        Reader r2 = new Reader();

        r1.createReader("Messi", 2);
        r2.createReader("Ronaldo", 5);

        System.out.println("1 ==========");
        r1.readerInfo();

        System.out.println("2 ==========");
        r2.addBook("Java");
        r2.addBook("Python");
        r2.addBook("C++");
        r2.readerInfo();

        System.out.println("3 ==========");
        r1.addBook("C#");
        r1.addBook("Rust");
        r1.addBook("GoLang");

        System.out.println("4 ==========");
        r1.increaseCapacity(5);
        r1.addBook("Python");

        System.out.println("5 ==========");
        r1.readerInfo();
    }
}
