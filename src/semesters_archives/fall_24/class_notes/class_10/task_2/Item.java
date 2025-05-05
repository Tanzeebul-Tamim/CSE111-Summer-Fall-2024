/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package semesters_archives.fall_24.class_notes.class_10.task_2;

// Class to represent an item in an order
public class Item {
    // Instance variables to hold item details
    public String itemName; // Name of the item
    public int quantity; // Quantity of the item ordered
    private double unitPrice; // Price per unit of the item
    public String address; // Delivery address for the order

    // Constructor to initialize the item details (without address)
    public Item(String name, int qty, double price) {
        this(name, qty, price, null); // Calls the main constructor with a null address
    }

    // Constructor to initialize the item details (with address)
    public Item(String name, int qty, double price, String address) {
        this.itemName = name; // Set the name of the item
        this.quantity = qty; // Set the quantity of the item
        this.unitPrice = price; // Set the price per unit
        this.address = address; // Set the delivery address
        System.out.println("Order Set successfully"); // Confirmation message
    }

    // Method to print the order details
    public void printOrder() {
        System.out.println("Order Details:"); // Header for order details
        System.out.println("Product: " + itemName); // Print the item name
        System.out.print("Delivery Location: "); // Print delivery location

        // Check if a delivery address is provided
        if (address != null) {
            System.out.println(address); // Print the delivery address
            // Calculate and print total cost including delivery charge
            System.out.println("Price: " + unitPrice + " tk X " + quantity + " = " + (quantity * unitPrice) + " tk");
            System.out.println(" + 50 tk Delivery charge = " + (quantity * unitPrice + 50) + " tk");
        } else {
            // No delivery address case
            System.out.println("No delivery address set");
            // Calculate and print total cost without delivery charge
            System.out.println("Price: " + unitPrice + " tk X " + quantity + " = " + (quantity * unitPrice) + " tk");
        }
    }
}
