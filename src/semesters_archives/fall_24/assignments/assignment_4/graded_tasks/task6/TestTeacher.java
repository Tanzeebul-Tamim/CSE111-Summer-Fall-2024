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

package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task6;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Matin Saad Abdullah", "MSA");
        Teacher t2 = new Teacher("Mumit Khan", "MMK");
        Teacher t3 = new Teacher("Sadia Hamid Kazi", "SKZ");
        Course c1 = new Course("CSE 110");
        Course c2 = new Course("CSE 111");
        Course c3 = new Course("CSE 220");
        Course c4 = new Course("CSE 221");
        Course c5 = new Course("CSE 230");
        Course c6 = new Course("CSE 310");
        Course c7 = new Course("CSE 320");
        Course c8 = new Course("CSE 340");
        t1.addCourse(c1);
        t1.addCourse(c2);
        t2.addCourse(c3);
        t2.addCourse(c4);
        t2.addCourse(c5);
        t3.addCourse(c6);
        t3.addCourse(c7);
        t3.addCourse(c8);
        System.out.println("1========================");
        t1.printDetail();
        System.out.println("2========================");
        t2.printDetail();
        System.out.println("3========================");
        t3.printDetail();

    }
}