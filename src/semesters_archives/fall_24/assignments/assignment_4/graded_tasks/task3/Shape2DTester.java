package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task3;

public class Shape2DTester {
    public static void main(String[] args) {
        Shape2D sq = new Shape2D();
        System.out.println("---------1----------");
        sq.area();
        System.out.println("---------2----------");
        Shape2D rectangle = new Shape2D(5, 6);
        System.out.println("---------3----------");
        rectangle.area();
        System.out.println("---------4----------");
        Shape2D tri1 = new Shape2D(5, 6, "Triangle");
        System.out.println("---------5----------");
        tri1.area();
        System.out.println("---------6----------");
        Shape2D tri2 = new Shape2D(5, 6, 7);
        System.out.println("---------7----------");
        tri2.area();
        System.out.println("---------8----------");
    }
}