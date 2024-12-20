package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task4;

public class TestU4 {
    public static void main(String[] args) {
        Quiz1 q1 = new Quiz1();
        q1.methodA();
        q1.methodA();
        Quiz1.temp += 2;
        Quiz1 q2 = new Quiz1(2);
        q2.methodA();
        q2.methodA();
    }
}

// Outputs:
/*
    5 21 31
    11 3 45
    23 59 127
    30 21 178
    14 45 72
    23 12 107
    47 113 267
    57 45 369
 */