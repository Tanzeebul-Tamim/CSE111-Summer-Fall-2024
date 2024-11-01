package summer_24.assignments.assignment_6.task2;

public class ShelfTester {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        shelf.showDetails();
        System.out.println("1---------------");
        shelf.addBooks(3);
        System.out.println("2---------------");
        shelf.capacity = 7;
        shelf.addBooks(3);
        System.out.println("3---------------");
        shelf.showDetails();
        System.out.println("4---------------");
        shelf.addBooks(5);
        shelf.showDetails();
        shelf.capacity += 4;
        System.out.println("6---------------");
        shelf.addBooks(5);
        shelf.showDetails();
    }
}
