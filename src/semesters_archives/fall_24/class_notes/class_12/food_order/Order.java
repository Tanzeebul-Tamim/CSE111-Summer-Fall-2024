package semesters_archives.fall_24.class_notes.class_12.food_order;

// Class to represent a food order
public class Order {
    public static int orderCount; // Static variable to track the total number of orders
    public int orderNo; // Unique order number for each order
    public String item; // Name of the item being ordered

    // Constructor to initialize an order with the specified item
    public Order(String item) {
        this.item = item; // Set the ordered item
        Order.orderCount++; // Increment the total order count
        this.orderNo = orderCount; // Assign the current order count as the order number
    }
}
