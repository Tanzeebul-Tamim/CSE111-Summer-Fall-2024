package semesters_archives.fall_24.quiz.lab_quiz.quiz_5;

public class Tester {
    public static void main(String[] args) {
        LabQuiz quiz1 = new LabQuiz(3, -3);
        LabQuiz quiz2 = new LabQuiz(-4, 4);
        quiz1.methodA(AnotherClass.x - 3);
        quiz1.methodB(quiz2);
    }
}

// Outputs:
/*
    -48 14 -14
    -48 -57 9
    -4 -35 8
 */