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

public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;

    public Book() {
        this.title = "Not Set";
        this.author = "Unknown";
        this.genre = "Not Set";
    }

    public void createBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void createBook(String title, String author) {
        createBook(title, author, this.genre);
    }

    public void createBook(String title) {
        createBook(title, this.author);
    }

    public void customizeGenre(String genre) {
        System.out.printf("Updated genre of \"%s\" to %s.\n", this.title, genre);
        this.genre = genre;
    }

    public void customizePages(int pages) {
        System.out.printf("Updated pages of \"%s\" to %d pages.\n", this.title, pages);
        this.pages = pages;
    }

    public void displayDetails() {
        System.out.printf("Title: %s, Author: %s, Genre: %s, Pages: %d\n", this.title, this.author, this.genre,
                this.pages);
    }
}
