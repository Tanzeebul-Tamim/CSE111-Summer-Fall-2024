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

package semesters_archives.summer_24.assignments.assignment_8.task4;

public class Tester {
    public static void main(String args[]) {
        Borrower.bookStatus();
        System.out.println("*********1*********");
        Borrower b1 = new Borrower("Nabila");
        b1.borrowBook("Pather Panchali");
        b1.borrowBook("Anandmath");
        b1.borrowerDetails();
        System.out.println("*********2*********");
        Borrower b2 = new Borrower("Sadia");
        b2.borrowBook("Anandmath");
        b2.borrowBook("Durgesh Nandini");
        b2.borrowBook("Pather Panchali");
        b2.borrowerDetails();
        System.out.println("*********3*********");
        System.out.println(Borrower.remainingBooks("Anandmath") + " copies of Anandmath is remaining.");
        System.out.println("*********4*********");
        Borrower b3 = new Borrower("Anika");
        b3.borrowBook("Anandmath");
        Borrower.bookStatus();
        System.out.println("*********5*********");
        Borrower b4 = new Borrower("Oishi");
        b4.borrowBook("Anandmath");
        b4.borrowBook("Durgesh Nandini");
        b4.borrowerDetails();
    }
}
