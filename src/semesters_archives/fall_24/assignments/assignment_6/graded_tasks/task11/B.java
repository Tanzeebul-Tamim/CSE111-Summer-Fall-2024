package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task11;

public class B {
    public static int x;
    public int y = 4;
    public int temp = -5;
    public int sum = 2;

    public B() {
        y = temp + 3;
        sum = 3 + temp + 3;
        temp -= 2;
    }

    @SuppressWarnings("static-access")
    public B(B b) {
        sum = b.sum;
        x = b.x;
        b.methodB(1, 3);
    }

    public void methodA(int m, int n) {
        int x = 2;
        y = y + m + (temp++);
        x = x + 7 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB(int m, int n) {
        int y = 0;
        y = y + this.y;
        x = this.y + 3 + temp;
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y + " " + sum);
    }

    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(3, 2);
        b2.methodB(1, 2);
    }
}

// Outputs:
/*
    7 -15 -7
    -6 -2 -15
    11 -18 -22
    13 1 15
    2 4 21
 */
