package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task9;

public class Test9 {
    public static void main(String[] args) {
        Tracing t1 = new Tracing(2, 3);
        t1.methodA(1);
        Tracing t2 = new Tracing(3, 4);
        t2.methodA(2);
        t1.methodB(t2);
        t2.methodB(t2);
    }
}

// Outputs:
/*
    2 1 1
    2 6 2
    5 5 3
    5 14 8
    5 -4 8
    5 4 8
 */
