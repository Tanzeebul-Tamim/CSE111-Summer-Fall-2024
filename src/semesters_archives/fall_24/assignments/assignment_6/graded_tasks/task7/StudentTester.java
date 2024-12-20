package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task7;

public class StudentTester {
    public static void main(String[] args) {
        Student.printDetails();
        System.out.println("--------------------");
        Student mikasa = new Student("Mikasa", 3.75);
        mikasa.individualDetail();
        System.out.println("--------------------");
        Student.printDetails();
        System.out.println("--------------------");
        Student harry = new Student("Harry", 2.5, "Charms");
        harry.individualDetail();
        System.out.println("--------------------");
        Student.printDetails();
        System.out.println("--------------------");
        Student levi = new Student("Levi", 3.33);
        levi.individualDetail();
        System.out.println("--------------------");
        Student.printDetails();
    }
}
