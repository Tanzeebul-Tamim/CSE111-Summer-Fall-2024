package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task5;

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
