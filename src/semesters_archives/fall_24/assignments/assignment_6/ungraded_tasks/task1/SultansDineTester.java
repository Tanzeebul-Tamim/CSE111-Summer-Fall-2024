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

package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task1;

public class SultansDineTester {
    public static void main(String[] args) {
        SultansDine.details();
        System.out.println("1===================");
        SultansDine dhanmondi = new SultansDine("Dhanmondi");
        dhanmondi.sellQuantity(25);
        dhanmondi.branchInformation();
        System.out.println("2===================");
        SultansDine.details();
        System.out.println("3===================");
        SultansDine baily_road = new SultansDine("Baily Road");
        baily_road.sellQuantity(15);
        baily_road.branchInformation();
        System.out.println("4===================");
        SultansDine.details();
        System.out.println("5===================");
        SultansDine gulshan = new SultansDine("Gulshan");
        gulshan.sellQuantity(9);
        gulshan.branchInformation();
        System.out.println("6===================");
        SultansDine.details();

    }
}
