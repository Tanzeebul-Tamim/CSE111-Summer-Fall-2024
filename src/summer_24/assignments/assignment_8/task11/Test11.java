package summer_24.assignments.assignment_8.task11;

public class Test11 {
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