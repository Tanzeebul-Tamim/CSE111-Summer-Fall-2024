package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task9;

public class Tester9 {
    public static void main(String args[]) {
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(1, 2);
        b2.methodB(3, 2);
    }
}

// Outputs:
/*
 * 5 -16 -11
 * -7 -2 -20
 * 9 -21 -32
 * 12 2 14
 * 2 5 21
 */
