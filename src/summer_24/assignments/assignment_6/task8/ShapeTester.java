package summer_24.assignments.assignment_6.task8;

public class ShapeTester {
    public static void main(String args[]) {
        Shape circle = new Shape();
        Shape triangle = new Shape();
        Shape trapezium = new Shape();

        circle.setParameters("Circle", 5);
        triangle.setParameters("Triangle", 4, 7);
        trapezium.setParameters("Trapezium", 2, 4, 9);
        
        System.out.println(circle.details());
        System.out.println("---------------");
        System.out.println(triangle.details());
        System.out.println("---------------");
        System.out.println(trapezium.details());
    }
}
