package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task3;

@SuppressWarnings("static-access")
public class B extends A {
    public static int x = 0;

    public int sum = -6;

    public B() {
        super();
        sum = 0;
        y = temp + 3;
        super.sum = 3 + temp + 2;
        temp -= 2;
    }

    public B(B b) {
        super();
        if (b == null) {
            y = temp + 3;
            sum = 3 + temp + 2;
            temp -= 2;
        } else {
            sum = b.sum + super.sum;
            x = b.x;
            b.methodB(2, 3);
        }
    }

    public void methodB(int m, int n) {
        int y = 0;
        y = y + this.y;
        x = y + 2 + (++temp);
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y + " " + sum);
    }
}
