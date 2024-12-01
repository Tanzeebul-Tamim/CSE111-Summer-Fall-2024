package summer_24.assignments.assignment_8.task2;

public class BookTester {
    public static void main(String[] args) {
        System.out.println("Total Books Sold: " + Book.total_books_sold);
        System.out.println("Total Revenue: " + Book.total_revenue + " TK");
        System.out.println("==========1==========");

        Book b1 = new Book("Java Programming", 10); // 10% discount
        b1.bookDetails();

        System.out.println("==========2==========");

        Book b2 = new Book("Python Programming", 15); // 15% discount
        b2.bookDetails();

        System.out.println("==========3==========");

        Book b3 = new Book("Data Structures", 5); // 5% discount
        b3.bookDetails();

        System.out.println("==========4==========");
        System.out.println("Total Books Sold: " + Book.total_books_sold);
        System.out.println("Total Revenue: " + Book.total_revenue + " TK");

    }
}
