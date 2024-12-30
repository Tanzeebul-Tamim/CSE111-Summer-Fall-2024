package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task4;

public class Circle {
    protected static int count;
    private int radius;

    protected Circle(int radius) {
        this.radius = radius;
        count++;
    }

    protected double getRadius() {
        return this.radius;
    }

    protected void setRadius(int radius) {
        this.radius = radius;
    }
    
    protected String area() {
        return "\n" + (Math.PI * Math.pow(radius, 2));
    }
}
