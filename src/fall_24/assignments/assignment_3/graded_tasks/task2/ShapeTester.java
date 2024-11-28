package fall_24.assignments.assignment_3.graded_tasks.task2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Shape();
        Shape triangle = new Shape();
        Shape rectangle = new Shape();
        
        circle.setParameters("Circle", 5);
        triangle.setParameters("Triangle", 4, 7);
        rectangle.setParameters("Rectangle", 2.4, 4.4);
        System.out.println(circle.details());
        System.out.println("1---------------");
        System.out.println(triangle.details());
        System.out.println("2---------------");
        System.out.println(rectangle.details());
    }
}
