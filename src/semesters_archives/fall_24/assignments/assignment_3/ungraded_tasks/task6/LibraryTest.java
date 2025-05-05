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

package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task6;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.createBook("The Great Gatsby");
        Book book2 = new Book();
        book2.createBook("1984", "George Orwell");
        Book book3 = new Book();
        book3.createBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
        System.out.println("|---Book Customization---|");
        book1.customizeGenre("Classic");
        book1.customizePages(180);
        book2.customizeGenre("Dystopian");
        book2.customizePages(328);
        book3.customizePages(281);
        System.out.println();
        System.out.println("|---Library Inventory---|");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
