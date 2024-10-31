package summer_24.assignments.assignment_5.task7;

public class Reader {
    private String name;
    private int bookCount;
    private int capacity;
    private String[] booksRead;

    Reader() {
        this.name = "New user";
        this.capacity = 0;
        this.bookCount = 0;
    }

    void createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.booksRead = new String[capacity];
    }

    void readerInfo() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Capacity: %d\n", capacity);
        System.out.println("Books:");
        if (bookCount == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < capacity; i++) {
                if (booksRead[i] != null) {
                    System.out.printf("Book %d: %s\n", i + 1, booksRead[i]);
                }
            }
        }
    }

    void addBook(String bookName) {
        if (bookCount < capacity) {
            booksRead[bookCount] = bookName;
            bookCount++;
        } else {
            System.out.println("No more space for new book");
        }
    }

    void increaseCapacity(int capacity) {
        String[] preserveBooks = new String[capacity];

        for (int i = 0; i < this.capacity; i++) {
            preserveBooks[i] = booksRead[i];
        }

        this.capacity = capacity;
        System.out.printf("%s's capacity increased to %d\n", name, capacity);

        booksRead = preserveBooks;
    }
}
