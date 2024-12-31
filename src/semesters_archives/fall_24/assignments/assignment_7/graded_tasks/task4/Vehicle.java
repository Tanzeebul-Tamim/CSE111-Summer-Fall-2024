package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task4;

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

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
