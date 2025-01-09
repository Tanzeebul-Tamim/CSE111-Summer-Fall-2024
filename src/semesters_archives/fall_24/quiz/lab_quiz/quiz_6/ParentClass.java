package semesters_archives.fall_24.quiz.lab_quiz.quiz_6;

@SuppressWarnings("static-access")
public class ParentClass {
    public static int temp = 5;
    private int a = 10;
    public int b = 6;

    public ParentClass(int t) {
        temp--;
        a += temp;
        this.b = t + this.b;
    }

    public void methodA(int a) {
        a = this.a + temp;
        this.a = this.temp + 2;
        System.out.println(a + " " + this.temp + " " +
                b);
    }

    public int getA() {
        return a;
    }
}
