package fall_24.assignments.assignment_3.ungraded_tasks.task4;

public class CustomerTester {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.createCustomer("John");
        System.out.println("1=====================");
        c1.showCart();
        System.out.println("2=====================");
        c1.addItem("Apple", 2);
        c1.addItem("Orange", 5);
        c1.addItem("Bread", 5);
        c1.addItem("Milk", 3);
        c1.addItem("Eggs", 2);
        System.out.println("3=====================");
        c1.showCart();
        System.out.println("4=====================");
        c1.calculatePrice();
        System.out.println("5=====================");
        Customer c2 = new Customer();
        c2.createCustomer("Jane");
        c2.addItem("Apple", 2, "Orange", 5);
        c2.addItem("Chocolates", 15, "Bread", 5);
        c2.addItem("Milk", 3);
        System.out.println("6=====================");
        c2.showCart();
        System.out.println("7=====================");
        c2.calculatePrice();
    }
}
