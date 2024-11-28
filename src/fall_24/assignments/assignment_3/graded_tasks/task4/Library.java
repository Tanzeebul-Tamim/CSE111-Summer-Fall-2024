package fall_24.assignments.assignment_3.graded_tasks.task4;

public class Library {
    private int capacity;
    private int bookCount;
    private String[] books;

    public void setBookCapacity(int capacity) {
        this.capacity = capacity;
        books = new String[capacity];
    }

    public void addBook(String book) {
        if (this.bookCount >= this.capacity) {
            System.out.printf("Maximum capacity exceeds. You can't add more than %d books\n", this.capacity);
        } else {
            this.books[this.bookCount] = book;
            this.bookCount++;
            System.out.printf("Book '%s' added to the library\n", book);
        }
    }

    public void printDetail() {
        System.out.format("Maximum Capacity: %d\n", this.capacity);
        System.out.format("Total Books: %d\n", this.bookCount);

        System.out.println("Book list:");
        for (String book : this.books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
