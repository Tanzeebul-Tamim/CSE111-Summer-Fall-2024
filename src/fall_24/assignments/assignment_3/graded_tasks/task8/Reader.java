package fall_24.assignments.assignment_3.graded_tasks.task8;

public class Reader {
    private String name;
    private int capacity;
    private int count;
    private String[] books;

    public Reader() {
        this.name = "New user";
    }

    public String createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new String[this.capacity];

        return "A new reader is created!";
    }

    public void readerInfo() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Capacity: %d\n", this.capacity);
        System.out.println("Books:");

        if (this.count == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < count; i++) {
                String book = this.books[i];

                if (book != null) {
                    System.out.printf("Book %d: %s\n", i + 1, book);
                }
            }
        }
    }

    public void addBook(String book) {
        if (count >= capacity) {
            System.out.println("No more capacity");
        } else {
            books[count] = book;
            count++;
        }
    }
}
