package semesters_archives.fall_24.class_notes.class_12.food_order;

// Class to test the Order class
public class Tester0002 {
    public static void main(String[] args) {
        Order o1 = new Order("Burger"); // Create a new order for a burger
        System.out.println(o1.orderNo + " " + o1.item); // Display order number and item name

        Order o2 = new Order("Pizza"); // Create a new order for a pizza
        System.out.println(o2.orderNo + " " + o2.item); // Display order number and item name

        Order o3 = new Order("Pasta"); // Create a new order for pasta
        System.out.println(o3.orderNo + " " + o3.item); // Display order number and item name

        System.out.println("---- ----"); // Separator for clarity in output
        System.out.println(o1.orderNo + " " + o1.item); // Re-display order details for the first order
    }
}
