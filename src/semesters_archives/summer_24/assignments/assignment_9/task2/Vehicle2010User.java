package semesters_archives.summer_24.assignments.assignment_9.task2;

public class Vehicle2010User {
    public static void main(String[] args) {
        Vehicle2010 car1 = new Vehicle2010();
        car1.position();
        car1.moveLowerLeft();
        car1.position();

        Vehicle2010 car2 = new Vehicle2010();
        car2.position();
        car2.moveUpperRight();
        car2.position();
        car2.moveLowerRight();
        car2.position();
    }
}
