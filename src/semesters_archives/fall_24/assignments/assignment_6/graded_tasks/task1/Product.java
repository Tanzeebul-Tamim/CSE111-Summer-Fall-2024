package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task1;

public class Product {
    private String name;
    private int quantity;
    private double price;

    protected Product() {
        this("Unknown", 0);
    }

    protected Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected void displayInfo() {
        this.displayInfo(false);
    }

    protected void displayInfo(boolean display) {
        String name;
        double price;
        int quantity;

        if (display) {
            name = this.name;
            price = this.price;
            quantity = this.quantity;
        } else {
            name = "Unknown";
            price = 0;
            quantity = 0;
        }

        System.out.format("Product Name: %s\n", name);
        System.out.format("Price: $%.1f", price);

        if (display) {
            System.out.println();
        }

        if (this.quantity != 0) {
            System.out.format("Quantity: %d\n", quantity);
        }
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getQuantity() {
        return this.quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected double getPrice() {
        return this.price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}
