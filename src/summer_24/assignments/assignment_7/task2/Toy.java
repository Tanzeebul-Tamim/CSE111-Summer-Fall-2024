package summer_24.assignments.assignment_7.task2;

public class Toy {
    public String name;
    private int price;

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("A new toy has been made!");
    }

    public void updateName(String name) {
        System.out.printf("Changing old name: %s\n", this.name);
        this.name = name;
        System.out.printf("New Name: %s\n", this.name);
    }

    public void updatePrice(int price) {
        this.price = price;
    }

    public void showPrice() {
        System.out.printf("Price: %d taka\n", this.price);
    }
}
