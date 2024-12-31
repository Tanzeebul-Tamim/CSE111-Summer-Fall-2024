package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task4;

public class Vehicle2010 extends Vehicle {
    public void position() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }

    public void moveUpperRight() {
        moveUp();
        moveRight();
    }

    public void moveLowerRight() {
        moveDown();
        moveRight();
    }

    public void moveLowerLeft() {
        moveDown();
        moveLeft();
    }
}
