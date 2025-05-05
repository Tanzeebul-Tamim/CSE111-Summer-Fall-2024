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

package semesters_archives.summer_24.assignments.assignment_5.task7;

public class Reader {
    private String name;
    private int bookCount;
    private int capacity;
    private String[] booksRead;

    public Reader() {
        this.name = "New user";
    }

    public void createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.booksRead = new String[capacity];
    }

    public void readerInfo() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Capacity: %d\n", capacity);
        System.out.println("Books:");
        if (bookCount == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < capacity; i++) {
                if (booksRead[i] != null) {
                    System.out.printf("Book %d: %s\n", i + 1, booksRead[i]);
                }
            }
        }
    }

    public void addBook(String bookName) {
        if (bookCount < capacity) {
            booksRead[bookCount++] = bookName;
        } else {
            System.out.println("No more space for new book");
        }
    }

    public void increaseCapacity(int capacity) {
        String[] preserveBooks = new String[capacity];

        for (int i = 0; i < this.capacity; i++) {
            preserveBooks[i] = booksRead[i];
        }

        this.capacity = capacity;
        System.out.printf("%s's capacity increased to %d\n", name, capacity);

        booksRead = preserveBooks;
    }
}
