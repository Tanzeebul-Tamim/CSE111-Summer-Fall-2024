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

public class Borrower {
    public static int book_count[] = { 3, 3, 3 };
    public static String book_name[] = { "Pather Panchali", "Durgesh Nandini", "Anandmath" };

    private String name;
    private String[] booksBorrowed;
    private int borrowedBookCount;

    public Borrower(String name) {
        this.name = name;
        this.booksBorrowed = new String[book_name.length];
    }

    public static void bookStatus() {
        System.out.println("Available Books:");

        for (int i = 0; i < book_count.length; i++) {
            String bookName = book_name[i];
            int bookCount = book_count[i];

            System.out.printf("%s : %d\n", bookName, bookCount);
        }
    }

    public static int remainingBooks(String book) {
        boolean found = false;
        int bookIdx = -1;

        for (String bookName : book_name) {
            bookIdx++;

            if (bookName.equals(book)) {
                found = true;
                break;
            }
        }

        if (found) {
            int count = book_count[bookIdx];
            return count;
        } else {
            return 0;
        }
    }

    public void borrowerDetails() {
        System.out.printf("Name: %s\n", this.name);
        System.out.println("Books Borrowed:");

        for (String book : this.booksBorrowed) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(String book) {
        int bookIdx = -1;

        for (String bookName : book_name) {
            bookIdx++;

            if (bookName.equals(book)) {
                break;
            }
        }

        if (remainingBooks(book) > 0) {
            book_count[bookIdx]--;
            this.booksBorrowed[this.borrowedBookCount++] = book;
        } else {
            System.out.println("This book is not available.");
        }
    }
}
