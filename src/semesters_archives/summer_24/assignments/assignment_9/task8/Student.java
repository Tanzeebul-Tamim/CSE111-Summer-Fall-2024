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

package semesters_archives.summer_24.assignments.assignment_9.task8;

public class Student {
    private static int cseStudentCount;
    private static int bbaStudentCount;
    private static int totalStudentCount;

    private String name;
    private String department;
    private int serial;
    private int deptSerial;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;

        if (department.equals("CSE")) {
            cseStudentCount++;
            this.deptSerial += cseStudentCount;
        } else if (department.equals("BBA")) {
            bbaStudentCount++;
            this.deptSerial += bbaStudentCount;
        }

        totalStudentCount = cseStudentCount + bbaStudentCount;
        this.serial = totalStudentCount;

        System.out.printf("Creating Student Number: %d\n", this.serial);
    }

    public static void totalInfo() {
        System.out.printf("Total Students: %d\n", totalStudentCount);
        System.out.printf("Total CSE Students: %d\n", cseStudentCount);
        System.out.printf("Total BBA Students: %d\n", bbaStudentCount);
    }

    public void individualInfo() {
        System.out.printf("%s is from %s department.\n", this.name, this.department);
        System.out.printf("Serial of %s among all students' is: %d\n", this.name, this.serial);
        System.out.printf("Serial of %s in %s department is: %d\n", this.name, this.department, this.deptSerial);
    }
}
