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

package semesters_archives.summer_24.mid_term.oop;

/*
    You are building a system to simulate the process of creating and managing an examination.
        ● When the constructor is invoked, it sets the name, time, and the number of topics for the exam.
        ● The printInfo() method prints the examination details.
        ● The setTopic() method is used for setting the topics for the examination.
        ● The endExam() method is used to end a examination.

    Expected output:

    1 ==========
    2 ==========
    Midterm Examination:
    Time left: 60.0 mins
    Topics chosen:
    Math
    Physics
    3 ==========
    4 ==========
    Couldn't add topic Biology.
    5 ==========
    Midterm Examination:
    Time left: 60.0 mins
    Topics chosen:
    Math
    Physics
    Chemistry
    6 ==========
    The Midterm examination has ended.
    7 ==========
    8 ==========
    Finals Examination:
    Time left: 120.0 mins
    No topics were chosen.
    9 ==========
    The Finals examination has ended.
    10 ==========
*/

public class ExamTester {
    public static void main(String[] args) {
        Exam exam1 = new Exam();
        Exam exam2 = new Exam();
        exam1.createExam("Midterm", 60.0, 3);
        exam2.createExam("Finals", 120.0, 4);
        System.out.println("1 ==========");
        exam1.setTopic("Math");
        exam1.setTopic("Physics");
        System.out.println("2 ==========");
        exam1.printInfo();
        System.out.println("3 ==========");
        exam1.setTopic("Chemistry");
        System.out.println("4 ==========");
        exam1.setTopic("Biology");
        System.out.println("5 ==========");
        exam1.printInfo();
        System.out.println("6 ==========");
        System.out.println(exam1.endExam());
        System.out.println("7 ==========");
        System.out.println("8 ==========");
        exam2.printInfo();
        System.out.println("9 ==========");
        System.out.println(exam2.endExam());
        System.out.println("10 ==========");
    }
}
