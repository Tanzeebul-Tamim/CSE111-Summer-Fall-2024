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

package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task4;

public class CircleTester {
    public static void main(String[] args) {
        System.out.println("Total Circle: " + Circle.count);
        Circle c1 = new Circle(4);
        System.out.println("1---------------");
        System.out.println("Total Circle: " + Circle.count);
        System.out.println("First circle radius: " + c1.getRadius());
        System.out.println("First circle area: " + c1.area());
        System.out.println("2---------------");
        Circle c2 = new Circle(5);
        System.out.println("Total Circle: " + Circle.count);
        System.out.println("Second circle radius: " + c2.getRadius());
        System.out.println("Second circle area: " + c2.area());
        System.out.println("3---------------");
    }
}
