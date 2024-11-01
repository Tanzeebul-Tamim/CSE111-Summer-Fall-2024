package summer_24.assignments.assignment_6.task2;

public class Shelf {
    public int capacity;
    private int bookCount;

    Shelf() {
        this.capacity = 0;
        this.bookCount = 0;
    }

    void showDetails() {
        System.out.printf("Shelf capacity: %d\n", this.capacity);
        System.out.printf("Number of books: %d\n", this.bookCount);
    }

    void addBooks(int bookCount) {
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
