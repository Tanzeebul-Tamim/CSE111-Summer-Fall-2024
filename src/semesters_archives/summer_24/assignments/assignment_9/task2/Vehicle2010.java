package semesters_archives.summer_24.assignments.assignment_9.task2;

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
