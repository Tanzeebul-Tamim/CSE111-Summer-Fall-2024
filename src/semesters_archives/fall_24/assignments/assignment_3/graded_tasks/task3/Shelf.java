package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task3;

public class Shelf {
    public int capacity;
    private int bookCount;

    public void addBooks(int bookCount) {
        int emptySlot = this.capacity - this.bookCount;

        if (this.capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        } else if (bookCount >= emptySlot) {
            System.out.println("Exceeds capacity");
        } else {
            System.out.printf("%d books added to shelf\n", bookCount);
            this.bookCount += bookCount;
        }
    }

    public void showDetails() {
        System.out.format("Shelf capacity: %d\n", this.capacity);
        System.out.format("Number of books: %d\n", this.bookCount);
    }
}
