package summer_24.assignments.assignment_7.task5;

public class Book {
    private String title;
    private String author;
    private int price;

    Book(String title) {
        this.title = title;
        this.author = null;
        this.price = 0;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.printf("Title: %s", this.title);

        if (author != null) {
            System.out.printf(", Author: %s", this.author);
        }

        if (price == 0) {
            System.out.println();
        } else {
            System.out.printf(", Price: %d", this.price);
            System.out.println();
        }
    }

    void setDetails(int price) {
        this.price = price;
    }

    void setDetails(String author, int price) {
        this.author = author;
        this.price = price;
    }
}
