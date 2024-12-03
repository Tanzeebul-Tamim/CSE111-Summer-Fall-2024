package summer_24.assignments.assignment_7.task6;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this("Unknown", 0);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public void displayInfo() {
        System.out.printf("Product Name: %s\n", this.name);
        System.out.printf("Price: $%.1f", this.price);
    }

    public void displayInfo(boolean quantity) {
        displayInfo();

        if (quantity) {
            System.out.printf("\nQuantity: %d\n", this.quantity);
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
