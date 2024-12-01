package fall_24.assignments.assignment_2.ungraded_tasks.task1;

public class Cat {
    public String color;
    public String action;

    public Cat() {
        this.color = "White";
        this.action = "sitting";
    }

    public void printCat() {
        System.out.printf("%s cat is %s.\n", this.color, this.action);
    }
}
