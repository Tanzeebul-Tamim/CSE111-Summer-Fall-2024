package fall_24.class_notes.class_10;

// Class to represent an order item in an online shopping system
public class OrderItem {
    // Instance variables to store details about the order
    public String itemName;   // Name of the item ordered
    public int quantity;      // Quantity of the item ordered
    public double unitPrice;  // Price per unit of the item
    public String address;    // Delivery address

    // Default constructor to initialize default values
    public OrderItem() {
        this.address = "not"; // Default value for address
        System.out.println("this is orderItem() method");
    }

    // Method to set the order details (without delivery address)
    public void makeOrder(String name, int qty, double price) {
        this.itemName = name;     // Set the item name
        this.quantity = qty;      // Set the quantity
        this.unitPrice = price;   // Set the unit price
        System.out.println("Order Set successfully");
    }

    // Overloaded method to set the order details (with delivery address)
    public void makeOrder(String name, int qty, double price, String address) {
        this.address = address;   // Set the delivery address
        this.makeOrder(name, qty, price); // Reuse the other makeOrder method
    }

    // Method to display the details of the order
    public void printOrder() {
        System.out.println("Order Details:");             // Print header
        System.out.println("Product: " + itemName);       // Print product name
        System.out.print("Delivery Location: ");

        if (address != null) {                            // Check if the delivery address is set
            System.out.println(address);                 // Print the delivery address
            // Calculate and display the total price including delivery charge
            System.out.println("Price: " + unitPrice + " tk X " + quantity + " = " + (quantity * unitPrice) + " tk");
            System.out.println(" + 50 tk Delivery charge = " + (quantity * unitPrice + 50) + " tk");
        } else {                                          // If no delivery address is set
            System.out.println("No delivery address set");
            // Display the total price without a delivery charge
            System.out.println("Price: " + unitPrice + " tk X " + quantity + " = " + (quantity * unitPrice) + " tk");
        }
    }
}