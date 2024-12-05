package fall_24.assignments.assignment_4.graded_tasks.task5;

public class TriangleTester {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Triangle t3 = new Triangle();
        Triangle t4 = new Triangle();

        t1.updateSides(4, 4, 4);
        t2.updateSides(4, 5, 6);
        t3.updateSides(4, 5, 6);
        t4.updateSides(5, 4, 6);

        t1.triangleDetails();
        System.out.println("--------1--------");
        System.out.println(t1.printTriangleType());
        System.out.println("--------2--------");
        t3.triangleDetails();
        System.out.println(t3.printTriangleType());
        System.out.println("--------3--------");
        t4.triangleDetails();
        System.out.println(t4.printTriangleType());
        System.out.println("--------4--------");
        t2.compareTriangles(t3);
        System.out.println("--------5--------");
        t1.compareTriangles(t2);
        System.out.println("--------6--------");
        t1 = t2;
        t1.compareTriangles(t2);
        System.out.println("--------7--------");
        t3.compareTriangles(t4);
    }

}
