package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task4;

public class Vehicle2010User {
    public static void main(String[] args) {
        Vehicle2010 car1 = new Vehicle2010();
        System.out.println(car1);
        car1.moveLowerLeft();
        System.out.println(car1);

        Vehicle2010 car2 = new Vehicle2010();
        System.out.println(car2);
        car2.moveUpperRight();
        System.out.println(car2);
        car2.moveLowerRight();
        System.out.println(car2);

    }
}
