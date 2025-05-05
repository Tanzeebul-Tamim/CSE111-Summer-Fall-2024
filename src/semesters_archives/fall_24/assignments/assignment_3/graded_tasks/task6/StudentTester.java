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

package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task6;

public class StudentTester {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.showDetails();
        System.out.println("1---------------");
        std1.updateDetails("Alif", 3.99, 12);
        System.out.println("2---------------");
        std1.checkScholarshipEligibility();
        System.out.println("3---------------");
        std1.showDetails();
        Student std2 = new Student();
        std2.updateDetails("Mim", 3.4);
        Student std3 = new Student();
        std3.updateDetails("Henry", 3.5, 15, "BBA");
        System.out.println("5---------------");
        std2.checkScholarshipEligibility();
        System.out.println("6---------------");
        std3.checkScholarshipEligibility();
        System.out.println("7---------------");
        std2.showDetails();
        System.out.println("8---------------");
        std3.showDetails();
    }
}
