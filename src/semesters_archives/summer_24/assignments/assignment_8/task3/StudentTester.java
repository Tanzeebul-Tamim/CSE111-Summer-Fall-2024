package semesters_archives.summer_24.assignments.assignment_8.task3;

public class StudentTester {
    public static void main(String[] args) {
        Student.printDetails();
        System.out.println("--------------------");
        Student mikasa = new Student("Mikasa", 3.75);
        mikasa.individualDetail();
        System.out.println("--------------------");
        Student.printDetails();
        System.out.println("--------------------");
        Student harry = Student.createStudent("Harry", 2.5, "Charms");
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
