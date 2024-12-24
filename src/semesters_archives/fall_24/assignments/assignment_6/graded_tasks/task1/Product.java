package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task1;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product() {
        this("Unknown", 0);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        this.displayInfo(false);
    }

    public void displayInfo(boolean display) {
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
