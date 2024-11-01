package summer_24.assignments.assignment_7.task6;

public class Product {
    private String name;
    private double price;
    private int quantity;

    Product() {
        this.name = "Unknown";
        this.price = 0;
        this.quantity = 1;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    void displayInfo() {
        System.out.printf("Product Name: %s\n", this.name);
        System.out.printf("Price: $%.1f", this.price);
    }

    void displayInfo(boolean quantity) {
        displayInfo();

        if (quantity) {
            System.out.printf("\nQuantity: %d\n", this.quantity);
        }
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }
}
