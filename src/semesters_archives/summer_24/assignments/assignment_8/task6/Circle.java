package semesters_archives.summer_24.assignments.assignment_8.task6;

public class Circle extends Shape {
    public int radius;

    public void area() {
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("Area of %s %s: %.2f\n", color, name, area);
    }
}
