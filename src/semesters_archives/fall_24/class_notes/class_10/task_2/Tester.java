package semesters_archives.fall_24.class_notes.class_10.task_2;

public class Tester {
    public static void main(String[] args) {
        // System.out.println("1------------");
        // OrderItem item1 = new OrderItem();
        // item1.makeOrder("Jacket: Size L", 2, 1300);
        // System.out.println("2------------");
        // item1.printOrder();
        // System.out.println("3------------");
        // item1.address = "Gulshan";
        // item1.printOrder();
        // System.out.println("4------------");
        // OrderItem item2 = new OrderItem();
        // item2.makeOrder("Notebook", 5, 80, "Banani");
        // System.out.println("5------------");
        // item2.printOrder();
        // System.out.println("6------------");

        // Create an Item object with name, quantity, and unit price (without address)
        System.out.println("7------------");
        Item item_1 = new Item("Jacket: Size L", 2, 1300);

        // Print details of the item
        System.out.println("8------------");
        item_1.printOrder();

        // Add a delivery address to the item and print the updated details
        System.out.println("9------------");
        item_1.address = "Gulshan";
        item_1.printOrder();

        // Create another Item object with name, quantity, unit price, and address
        System.out.println("10-----------");
        Item item_2 = new Item("Notebook", 5, 80, "Banani");

        // Print details of the second item
        System.out.println("11-----------");
        item_2.printOrder();

        // End of testing
        System.out.println("12-----------");
    }
}
