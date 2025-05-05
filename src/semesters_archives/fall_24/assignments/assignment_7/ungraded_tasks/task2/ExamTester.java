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

package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task2;

public class ExamTester {
    public static void main(String[] args) {
        ScienceExam ex1 = new ScienceExam(100, 90, "Physics", "HigherMaths");
        System.out.println(ex1);
        System.out.println("---------------------");
        System.out.println(ex1.examSyllabus());
        System.out.println(ex1.examParts());
        System.out.println("=====================");
        ScienceExam ex2 = new ScienceExam(100, 120, "Physics", "HigherMaths", "Drawing");
        System.out.println(ex2);
        System.out.println("---------------------");
        System.out.println(ex2.examSyllabus());
        System.out.println(ex2.examParts());
    }
}
