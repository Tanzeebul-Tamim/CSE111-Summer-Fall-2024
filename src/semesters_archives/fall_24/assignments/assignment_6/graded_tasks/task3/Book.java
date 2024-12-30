package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task3;

public class Book {
    protected static int total_books_sold;
    protected static double total_revenue;

    private String title;
    private int discount;
    private double price;

    protected Book(String title, int discount) {
        this.title = title;
        this.discount = discount;
        this.price = 150;
        this.calculatePrice();

        total_books_sold++;
        total_revenue += this.price;
    }

    private void calculatePrice() {
        double discount = this.price * (this.discount / 100.0);
        this.price -= discount;
    }

    protected void bookDetails() {
        System.out.printf("Title: %s\n", this.title);
        System.out.printf("Price after Discount: %.1f TK\n", this.price);
    }
}
