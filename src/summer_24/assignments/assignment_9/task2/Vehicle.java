package summer_24.assignments.assignment_9.task2;

public class Vehicle {
    public int x;
    public int y;

    public void moveUp() {
        y = y + 1;
    }

    public void moveDown() {
        y = y - 1;
    }

    public void moveLeft() {
        x = x - 1;
    }

    public void moveRight() {
        x = x + 1;
    }

    public void position() {
        System.out.println("(" + x + "," + y + ")");
    }
}
