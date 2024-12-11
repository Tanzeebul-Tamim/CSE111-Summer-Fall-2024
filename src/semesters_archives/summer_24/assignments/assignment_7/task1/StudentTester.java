package semesters_archives.summer_24.assignments.assignment_7.task1;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Harry", "CSE");
        System.out.println(s1.name);
        s1.updateName("Harry Potter");
        System.out.println(s1.accessName());
        System.out.println(s1.prog);
        s1.updateProgram("CS");
        String prog = s1.accessProgram();
        System.out.println(prog);
    }
}
