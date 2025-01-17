package semesters_archives.fall_24.term_exams.final_exam.tracing;

@SuppressWarnings("static-access")
public class B extends A {
    public static int x = 7;

    public B() {
        temp = temp + 3;
        super.temp -= 2;
    }

    public B(B b) {
        sum = b.sum;
        y = b.x;
    }

    public void methodA(int m, int n) {
        y = y + this.y + m;
        x = this.y + super.x + temp;
        sum = x + y + super.sum + n;
        System.out.println(x + " " + y + " " + sum);
    }
}
