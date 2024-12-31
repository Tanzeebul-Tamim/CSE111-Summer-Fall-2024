package semesters_archives.fall_24.quiz.lab_quiz.quiz_5;

@SuppressWarnings("static-access")
public class LabQuiz {
    public static int x, y = 0;
    public int a, b = -20;

    public LabQuiz(int a, int b) {
        this.a -= a;
        this.b += b;
        x += AnotherClass.x;
        y += 3;
    }

    public void methodA(int a) {
        this.a = x + a;
        this.b = this.b + this.a + this.methodB();
        System.out.println(this.a + " " + this.b + " " + x);
    }

    public int methodB() {
        this.b = x - this.x - (++AnotherClass.x);
        System.out.println(a + " " + this.b + " " + AnotherClass.x);
        x = this.b - 5;
        return this.b;
    }

    public void methodB(LabQuiz quiz1) {
        quiz1.y = this.y - quiz1.b + this.b;
        this.a = (quiz1.x--) + (++AnotherClass.x);
        System.out.println(this.a + " " + quiz1.y + " " + this.x);
    }
}