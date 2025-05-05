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

package semesters_archives.summer_24.assignments.assignment_8.task3;

public class Student {
    private static int totalStudent;
    private static int cseStudent;

    private String name;
    private int id;
    private double cgpa;
    private String department;

    public Student(String name, double cgpa) {
        this.id = ++totalStudent;
        this.name = name;
        this.cgpa = cgpa;
        this.department = "CSE";
        cseStudent++;
    }

    public static Student createStudent(String name, double cgpa, String department) {
        Student newStudent = new Student(name, cgpa);
        newStudent.department = department;

        if (!newStudent.department.equals("CSE")) {
            cseStudent--;
        }

        return newStudent;
    }

    public static void printDetails() {
        int otherDeptStudents = totalStudent - cseStudent;

        System.out.printf("Total Student(s): %d\n", totalStudent);
        System.out.printf("CSE Student(s): %d\n", cseStudent);
        System.out.printf("Other Department Student(s): %d\n", otherDeptStudents);
    }

    public void individualDetail() {
        String formattedCgpa = String.format("%.2f", this.cgpa);

        if (formattedCgpa.endsWith(".00")) {
            formattedCgpa = formattedCgpa.substring(0, formattedCgpa.length() - 3);

        } else if (formattedCgpa.endsWith("0")) {
            formattedCgpa = formattedCgpa.substring(0, formattedCgpa.length() - 1);
        }

        System.out.printf("ID: %d\n", this.id);
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("CGPA: %s\n", formattedCgpa);
        System.out.printf("Department: %s\n", this.department);
    }

}
