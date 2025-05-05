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

package semesters_archives.summer_24.assignments.assignment_6.task7;

public class CourseTester2 {
    public static void main(String[] args) {
        Course2 c1 = new Course2();
        c1.createCourse("PL II", "CS11");
        System.out.println("--------1--------");
        c1.printDetails();
        System.out.println("--------2--------");
        c1.addContent("Overloading");
        c1.printDetails();
        System.out.println("--------3--------");
        c1.addContent("Encapsulation");
        c1.addContent("Static", "Polymorphism");
        c1.printDetails();
        System.out.println("--------4--------");
        c1.addContent("Inheritance");
        System.out.println("--------5--------");
        Course2 c2 = new Course2();
        c2.createCourse("DS", "CS22");
        c2.addContent("Stack");
        c2.addContent("Recursion", "Tree");
        c2.addContent("Heap", "Hashing");
        System.out.println("--------6--------");
        c2.printDetails();
    }
}