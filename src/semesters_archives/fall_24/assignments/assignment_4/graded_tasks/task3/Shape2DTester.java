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

package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task3;

public class Shape2DTester {
    public static void main(String[] args) {
        Shape2D sq = new Shape2D();
        System.out.println("---------1----------");
        sq.area();
        System.out.println("---------2----------");
        Shape2D rectangle = new Shape2D(5, 6);
        System.out.println("---------3----------");
        rectangle.area();
        System.out.println("---------4----------");
        Shape2D tri1 = new Shape2D(5, 6, "Triangle");
        System.out.println("---------5----------");
        tri1.area();
        System.out.println("---------6----------");
        Shape2D tri2 = new Shape2D(5, 6, 7);
        System.out.println("---------7----------");
        tri2.area();
        System.out.println("---------8----------");
    }
}