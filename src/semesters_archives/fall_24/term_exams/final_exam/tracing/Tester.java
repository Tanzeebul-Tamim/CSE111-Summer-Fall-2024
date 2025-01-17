package semesters_archives.fall_24.term_exams.final_exam.tracing;

/*
    Question: 

    Illustrate the output of the following statements.
    [Your outputs won't be accepted without the workings]
 */

public class Tester {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodB(1, 3);
        b2.methodA(5, 2);
    }
}

// Outputs:

/*
    17 7 34
    7 3 44
    23 19 51
 */