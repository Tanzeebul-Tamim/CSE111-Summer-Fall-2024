package semesters_archives.summer_24.assignments.assignment_6.task6;

public class CourseTester {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.createCourse("PL II", "CS11");
        System.out.println("--------1--------");
        c1.printDetails();
        System.out.println("--------2--------");
        c1.addOneContent("Overloading");
        c1.printDetails();
        System.out.println("--------3--------");
        c1.addOneContent("Encapsulation");
        c1.addTwoContent("Static", "Polymorphism");
        c1.printDetails();
        System.out.println("--------4--------");
        c1.addOneContent("Inheritance");
        System.out.println("--------5--------");
        Course c2 = new Course();
        c2.createCourse("DS", "CS22");
        c2.addOneContent("Stack");
        c2.addTwoContent("Recursion", "Tree");
        c2.addTwoContent("Heap", "Hashing");
        System.out.println("--------6--------");
        c2.printDetails();
    }
}
