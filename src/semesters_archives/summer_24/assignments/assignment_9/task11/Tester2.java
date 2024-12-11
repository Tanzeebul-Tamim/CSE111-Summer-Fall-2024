package semesters_archives.summer_24.assignments.assignment_9.task11;

public class Tester2 {
    public static void main(String[] args) {
        Quiz3A a1 = new Quiz3A();
        a1.methodB(1, 2);
        Quiz3A a2 = new Quiz3A(3);
        a2.methodB(2, 4);
        a1.methodB(2, 1);
    }
}

// Outputs:
/*
 * 4 8 20
 * 10 8 10
 * 6 21 39
 * 3 33 56
 */
