package semesters_archives.fall_24.quiz.lab_quiz.quiz_6;

public class Tester {
    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        ChildClass c2 = new ChildClass(c1);
        c2.methodA(6);
    }
}

// Outputs:
/*
    14 18 4
    16 3 10
    5 9 6
 */