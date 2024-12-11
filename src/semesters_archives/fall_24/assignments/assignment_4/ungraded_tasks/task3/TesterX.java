package semesters_archives.fall_24.assignments.assignment_4.ungraded_tasks.task3;

public class TesterX {
    public static void main(String[] args) {
        TracingX t1 = new TracingX();
        t1.y = t1.x = 5;
        TracingX t2 = new TracingX();
        t2.x = t1.metA(2);
        t2.y = t2.metA(4);
        System.out.println(t1.y + t1.x + " " + t2.x + " " + t2.y);
    }
}

// Outputs:
/*
 * 6 10 15
 * 28 34 35
 * 18 28 71
 */
