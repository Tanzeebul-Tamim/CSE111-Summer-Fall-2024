package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task10;

public class Tester {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        a1.methodA(1, 1);
        b1.methodA(1, 2);
        b2.methodB(3, 2);
    }
}

// Outputs:
/*
    3 15 31
    4 14 43
    8 30 63
    16 6 85
 */