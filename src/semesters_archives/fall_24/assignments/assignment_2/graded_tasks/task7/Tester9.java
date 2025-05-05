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

package semesters_archives.fall_24.assignments.assignment_2.graded_tasks.task7;

public class Tester9 {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        phone1.printDetails();
        phone1.model = "Nokia 1100";
        System.out.println("1##################");
        phone1.storeContact("Joy - 01834");
        System.out.println("===================");
        phone1.printDetails();
        System.out.println("2##################");
        phone1.storeContact("Toya - 01334");
        phone1.storeContact("Aayan - 01135");
        System.out.println("===================");
        phone1.printDetails();
        System.out.println("3##################");
        phone1.storeContact("Sani - 01441");
        System.out.println("===================");
        phone1.printDetails();
    }
}
