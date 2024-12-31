package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task8;

public class Tea {
    public String name;
    public int price;
    public boolean status;

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
        this.status = false;
    }

    public void productDetail() {
        System.out.println("Name: " + name + ", Price: " + price);
        System.out.println("Status: " + status);
    }
}
