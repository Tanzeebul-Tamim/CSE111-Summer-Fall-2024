package semesters_archives.fall_24.term_exams.final_exam.tracing;

@SuppressWarnings("static-access")
public class A {
    public static int temp = 4;
    public int x = 1, sum = 5, y = 3;

    public A() {
        y = temp - 2;
        sum = (temp--) + 3;
    }

    public void methodB(int a, int b) {
        int y = 0;
        y = y + this.y + a;
        x = y + this.x + temp;
        methodA(temp, b);
        sum = x + y + this.sum;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodA(int temp, int b) {
        int x = 1;
        y = y + b + (this.temp++);
        x = x + 2 + b;
        sum = sum + this.x + y;
        System.out.println(x + " " + y + " " + sum);
    }
}
