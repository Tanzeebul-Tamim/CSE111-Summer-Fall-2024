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

package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task8;

public class Reader {
    private String name;
    private int capacity;
    private int count;
    private String[] books;

    public Reader() {
        this.name = "New user";
    }

    public String createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new String[this.capacity];

        return "A new reader is created!";
    }

    public void readerInfo() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Capacity: %d\n", this.capacity);
        System.out.println("Books:");

        if (this.count == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < count; i++) {
                String book = this.books[i];

                if (book != null) {
                    System.out.printf("Book %d: %s\n", i + 1, book);
                }
            }
        }
    }

    public void addBook(String book) {
        if (count >= capacity) {
            System.out.println("No more capacity");
        } else {
            books[count++] = book;
        }
    }
}
