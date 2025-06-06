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

package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task5;

public class TriangleTester {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Triangle t3 = new Triangle();
        Triangle t4 = new Triangle();

        t1.updateSides(4, 4, 4);
        t2.updateSides(4, 5, 6);
        t3.updateSides(4, 5, 6);
        t4.updateSides(5, 4, 6);

        t1.triangleDetails();
        System.out.println("--------1--------");
        System.out.println(t1.printTriangleType());
        System.out.println("--------2--------");
        t3.triangleDetails();
        System.out.println(t3.printTriangleType());
        System.out.println("--------3--------");
        t4.triangleDetails();
        System.out.println(t4.printTriangleType());
        System.out.println("--------4--------");
        t2.compareTriangles(t3);
        System.out.println("--------5--------");
        t1.compareTriangles(t2);
        System.out.println("--------6--------");
        t1 = t2;
        t1.compareTriangles(t2);
        System.out.println("--------7--------");
        t3.compareTriangles(t4);
    }

}
