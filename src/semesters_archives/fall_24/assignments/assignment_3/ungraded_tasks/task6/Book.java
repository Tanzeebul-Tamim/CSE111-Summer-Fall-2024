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
