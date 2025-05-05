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

package semesters_archives.summer_24.assignments.assignment_7.task5;

public class BookTester {
    public static void main(String[] args) {
        System.out.println("<-----1----->");
        Book b1 = new Book("The Alchemist");
        b1.displayDetails();
        System.out.println("<-----2----->");
        Book b2 = new Book("1984", "George Orwell");
        b2.displayDetails();
        System.out.println("<-----3----->");
        Book b3 = new Book("To Kill a Mockingbird",
                "Harper Lee", 300);
        b3.displayDetails();
        System.out.println("<-----4----->");
        b1.setDetails(250);
        b1.displayDetails();
        System.out.println("<-----5----->");
        b2.setDetails("Orwell", 350);
        b2.displayDetails();
    }
}
