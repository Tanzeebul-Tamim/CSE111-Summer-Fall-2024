package fall_24.class_notes.lec_4.tester3;

public class Customer {
    public String name; // Public field to hold the customer's name
    public int age; // Public field to hold the customer's age

    // Method to display customer information in a formatted string
    public void show() {
        System.out.println("Customer Info: " + this.name + " (" + this.age + ")");
    }
}
