package semesters_archives.summer_24.assignments.assignment_4.task2;

public class Test2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        double area = Math.PI * Math.pow(circle1.radius, 2);
        double circumference = 2 * Math.PI * circle1.radius;

        System.out.println("Radius of the circle is " + circle1.radius);
        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }
}
