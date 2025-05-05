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

package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task4;

public class Tester {
    public static void main(String[] args) {
        Library a1 = new Library();
        a1.setBookCapacity(3);
        System.out.println("1-------------");
        a1.addBook("Ice");
        System.out.println("2-------------");
        a1.printDetail();
        System.out.println("3-------------");
        a1.addBook("Emma");
        a1.addBook("Wings");
        a1.addBook("Next");
        System.out.println("4-------------");
        a1.printDetail();
        Library a2 = new Library();
        a2.setBookCapacity(4);
        System.out.println("5-------------");
        a2.addBook("Onnobhubon");
        a2.addBook("Ami");
        System.out.println("6-------------");
        a2.printDetail();
        System.out.println("7-------------");
        a2.addBook("Deyal");
        a2.addBook("Himu");
        a2.addBook("Megher Upor Bari");
        System.out.println("8-------------");
        a2.printDetail();
    }
}
