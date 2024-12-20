package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task4;

public class Circle {
    public static int count;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        count++;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public String area() {
        return "\n" + (Math.PI * Math.pow(radius, 2));
    }
}
