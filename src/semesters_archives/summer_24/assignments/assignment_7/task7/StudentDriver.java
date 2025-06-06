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

package semesters_archives.summer_24.assignments.assignment_7.task7;

public class StudentDriver {
    public static void main(String[] args) {
        System.out.println("-----------------");
        Student student1 = new Student(12345678);
        student1.addCourse("CSE110");
        student1.setCG(2.5);
        student1.addCourse("CSE110");
        student1.addCourse("ENG101");
        student1.showAdvisee();
        System.out.println("-----------------");
        student1.rmAllCourse();
        student1.showAdvisee();
        System.out.println("-----------------");
        student1.setID(54652365);
        String[] courses = { "SOC101", "CSE111", "ENG102" };
        student1.addCourse(courses);
        student1.showAdvisee();
        System.out.println("-----------------");
        student1.addCourse("CSE230");
        student1.showAdvisee();
        System.out.println("-----------------");
        Student student2 = new Student(975738383, 3.7);
        String[] courses2 = { "CSE220", "PHY112", "MAT120", "BUS101", "CHN101" };
        student2.addCourse(courses2);
        student2.showAdvisee();
    }
}
