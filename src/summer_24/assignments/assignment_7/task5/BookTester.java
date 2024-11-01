package summer_24.assignments.assignment_7.task5;

public class BookTester {
    public static void main(String[] args) {
        System.out.println("<-----1----->");
        Book b1 = new Book("The Alchemist");
        b1.displayDetails();
        System.out.println("<-----2----->");
        Book b2 = new Book("1984", "George Orwell");
        b2.displayDetails();
        System.out.println("<-----3----->");
        Book b3 = new Book("To Kill a Mockingbird",
                "Harper Lee", 300);
        b3.displayDetails();
        System.out.println("<-----4----->");
        b1.setDetails(250);
        b1.displayDetails();
        System.out.println("<-----5----->");
        b2.setDetails("Orwell", 350);
        b2.displayDetails();
    }
}
