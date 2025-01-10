package semesters_archives.fall_24.assignments.assignment_8.task11;

@SuppressWarnings("static-access")
public class B extends A {
    public static int x = 1;

    public B() {
        super(5);
        sum = 2;
        y = A.temp + 1;
        B.x = 3 + temp + B.x;
        A.temp -= 2;
    }

    public B(B b) {
        super(2);
        sum = 3;
        this.sum = sum + this.sum % 2 + 2;
        B.x = b.x + B.x;
    }

    public void methodB(int m, int n) {
        int[] y = { 2, 3 };
        this.y = y[0] + this.y + m;
        B.x = this.y + 2 + A.temp - n;
        methodA(B.x, y);
        this.sum = B.x + y[1] + this.sum;
        System.out.println(B.x + " " + (y[0] + y[1]) + " " + this.sum);
    }
}
