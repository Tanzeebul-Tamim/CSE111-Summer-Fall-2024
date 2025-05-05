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

package semesters_archives.summer_24.assignments.assignment_6.task2;

public class Shelf {
    public int capacity;
    private int bookCount;

    public void showDetails() {
        System.out.printf("Shelf capacity: %d\n", this.capacity);
        System.out.printf("Number of books: %d\n", this.bookCount);
    }

    public void addBooks(int bookCount) {
        int remainingSlots = this.capacity - this.bookCount;

        if (this.capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        } else if (remainingSlots < bookCount) {
            System.out.println("Exceeds capacity");
        } else {
            this.bookCount += bookCount;
            System.out.printf("%d books added to shelf\n", bookCount);
        }
    }
}
