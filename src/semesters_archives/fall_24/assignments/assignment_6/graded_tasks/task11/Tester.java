package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task11;

public class Tester {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(3, 2);
        b2.methodB(1, 2);
    }
}

// Outputs:
/*
    7 -15 -7
    -6 -2 -15
    11 -18 -22
    13 1 15
    2 4 21
 */