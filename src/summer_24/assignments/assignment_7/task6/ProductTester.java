package summer_24.assignments.assignment_7.task6;

public class ProductTester {
    public static void main(String[] args) {
        System.out.println("<-----1----->");
        Product product1 = new Product();
        product1.displayInfo();
        System.out.println();
        System.out.println("<-----2----->");
        Product product2 = new Product("Laptop", 1200.00);
        product2.setQuantity(10);
        product2.displayInfo(true);
        System.out.println("<-----3----->");
        System.out.println("Retrieved Price: $" +
                product2.getPrice());
        System.out.println("Retrieved Quantity: " +
                product2.getQuantity());
    }
}
