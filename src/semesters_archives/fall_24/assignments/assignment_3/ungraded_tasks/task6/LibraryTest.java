package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task6;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.createBook("The Great Gatsby");
        Book book2 = new Book();
        book2.createBook("1984", "George Orwell");
        Book book3 = new Book();
        book3.createBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
        System.out.println("|---Book Customization---|");
        book1.customizeGenre("Classic");
        book1.customizePages(180);
        book2.customizeGenre("Dystopian");
        book2.customizePages(328);
        book3.customizePages(281);
        System.out.println();
        System.out.println("|---Library Inventory---|");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
