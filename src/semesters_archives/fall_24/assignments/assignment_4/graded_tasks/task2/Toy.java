package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task2;

public class Toy {
    public String name;
    private int price;

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;

        System.out.println("A new toy has been made!");
    }

    public void updateName(String name) {
        System.out.printf("Changing old name: %s\nnew name: %s\n", this.name, name);
        this.name = name;
    }

    public void updatePrice(int price) {
        this.price = price;
    }

    public void showPrice() {
        System.out.printf("price: %d Taka\n", this.price);
    }
}
