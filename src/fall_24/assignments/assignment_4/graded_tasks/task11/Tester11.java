package fall_24.assignments.assignment_4.graded_tasks.task11;

public class Tester11 {
    public static void main(String args[]) {
        int x[] = { 35 };
        A a1 = new A();
        A a2 = new A(-5, -7);
        a1.methodA(1, x);
        a2.methodA(1, x);
    }
}

// Outputs:
/*
    0 1 9
    48 -1 46
    0 3 3
    69 5 67
 */