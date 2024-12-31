package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task3;

public class Tester {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(2, 3);
        b2.methodB(3, 8);
    }
}

// Outputs:
/*
    4 2 11
    2 3 5
    4 2 17
    -3 -6 -10
    -2 -4 -7
 */