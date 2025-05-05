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

package semesters_archives.summer_24.assignments.assignment_7.task3;

public class ParcelDriver {
    public static void main(String[] args) {
        Parcel p1 = new Parcel();
        p1.printDetails();
        p1.name = "Spongebob";
        p1.printDetails();
        System.out.println("1**************");
        Parcel p2 = new Parcel("Bob the Builder");
        p2.weight = 15;
        p2.calcFee("Gulshan");
        p2.printDetails();
        System.out.println("2**************");
        p2.addWeight(25);
        p2.calcFee("Banani");
        p2.printDetails();
        System.out.println("3**************");
        Parcel p3 = new Parcel("Dora the Explorer", 10);
        p3.addWeight(15);
        p3.calcFee("Dhanmondi");
        p3.printDetails();
    }
}
