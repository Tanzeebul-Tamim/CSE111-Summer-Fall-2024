package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task1;

public class TestStudent {
    public static void main(String[] args) {
        BBAStudent b1 = new BBAStudent();
        BBAStudent b2 = new BBAStudent("Humty Dumty");
        BBAStudent b3 = new BBAStudent("Little Bo Peep");
        b1.details();
        System.out.println("1---------------");
        b2.details();
        System.out.println("2---------------");
        b3.details();

    }
}
