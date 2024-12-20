package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task4;

public class CircleTester {
    public static void main(String[] args) {
        System.out.println("Total Circle: " + Circle.count);
        Circle c1 = new Circle(4);
        System.out.println("1---------------");
        System.out.println("Total Circle: " + Circle.count);
        System.out.println("First circle radius: " + c1.getRadius());
        System.out.println("First circle area: " + c1.area());
        System.out.println("2---------------");
        Circle c2 = new Circle(5);
        System.out.println("Total Circle: " + Circle.count);
        System.out.println("Second circle radius: " + c2.getRadius());
        System.out.println("Second circle area: " + c2.area());
        System.out.println("3---------------");
    }
}
