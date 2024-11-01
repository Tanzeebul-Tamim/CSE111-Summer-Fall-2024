package summer_24.assignments.assignment_6.task1;

public class AssignmentTester {
    public static void main(String[] args) {
        Assignment as1 = new Assignment();
        as1.printDetails();
        System.out.println("1---------------");
        as1.tasks = 11;
        as1.difficulty = "Moderate";
        as1.submission = true;
        as1.printDetails();
        System.out.println("2---------------");
        as1.makeOptional();
        System.out.println("3---------------");
        as1.printDetails();
        System.out.println("4---------------");
        Assignment as2 = new Assignment();
        as2.tasks = 12;
        as2.difficulty = "Hard";
        as2.submission = false;
        as2.printDetails();
        System.out.println("5---------------");
        as2.makeOptional();
    }
}
