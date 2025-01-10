package semesters_archives.fall_24.assignments.assignment_8.task11;

public class Tester {
    public static void main(String[] args) {
        int[] n = { 23 };
        A a1 = new A(3);
        B b1 = new B();
        B b2 = new B(b1);
        a1.methodA(1, n);
        b2.methodB(3, 2);
        a1.methodA(1, n);
    }
}

// Outputs:
/*
    26 1 5
    5 -2 6
    -1 11 8
    10 -1 5
 */