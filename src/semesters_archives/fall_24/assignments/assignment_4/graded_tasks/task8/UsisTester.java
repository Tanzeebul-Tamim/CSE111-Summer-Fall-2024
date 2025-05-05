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

package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task8;

public class UsisTester {
    public static void main(String[] args) {
        Student rakib = new Student("Rakib", 12301455, "CSE");
        Student roy = new Student("Roy", 12501345, "CS");
        System.out.println("1*************");
        Usis usisObj = new Usis();
        System.out.println("2*************");
        usisObj.login(rakib);
        System.out.println("3*************");
        usisObj.advising(rakib);
        System.out.println("4*************");
        rakib.email = "rakib@hotmail.com";
        rakib.password = "1234";
        System.out.println("5*************");
        usisObj.login(rakib);
        System.out.println("6*************");
        usisObj.advising(rakib);
        System.out.println("7*************");
        usisObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
        System.out.println("8*************");
        usisObj.advising(rakib, "CSE110", "PHY111", "MAT110");
        System.out.println("9*************");
        usisObj.allAdviseeInfo();
        System.out.println("10*************");
        roy.email = "roy@hotmail.com";
        roy.password = "abcd";
        usisObj.login(roy);
        System.out.println("11*************");
        usisObj.advising(roy, "CSE110", "ENG101", "PHY112");
        System.out.println("12*************");
        usisObj.allAdviseeInfo();

    }
}