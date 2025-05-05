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

package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task4;

public class Library {
    private int capacity;
    private int bookCount;
    private String[] books;

    public void setBookCapacity(int capacity) {
        this.capacity = capacity;
        books = new String[capacity];
    }

    public void addBook(String book) {
        if (this.bookCount >= this.capacity) {
            System.out.printf("Maximum capacity exceeds. You can't add more than %d books\n", this.capacity);
        } else {
            this.books[this.bookCount++] = book;
            System.out.printf("Book '%s' added to the library\n", book);
        }
    }

    public void printDetail() {
        System.out.format("Maximum Capacity: %d\n", this.capacity);
        System.out.format("Total Books: %d\n", this.bookCount);

        System.out.println("Book list:");
        for (String book : this.books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
