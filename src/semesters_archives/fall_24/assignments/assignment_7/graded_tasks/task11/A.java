package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task11;

public class A {
    public static int temp = 3;

    public int sum;
    public int y;

    public A() {
        y = temp - 1;
        sum = temp + 2;
        temp -= 2;
    }

    public void methodA(int m, int[] n) {
        int x = 0;
        y = y + m + (temp++);
        x = x + 2 + (++n[0]);
        sum = sum + x + y;
        n[0] = sum + 2;
        System.out.println(x + " " + y + " " + sum);
    }
}
// ------------------------------------------
@SuppressWarnings("static-access")
class B extends A {
    public static int x = 1;

    public B() {
        y = temp + 1;
        x = 3 + temp + x;
        temp -= 2;
    }

    public B(B b) {
        sum = b.sum + super.sum;
        x = b.x + x;
    }

    public void methodB(int m, int n) {
        int[] y = { 0 };
        super.y = y[0] + this.y + m;
        x = super.y + 2 + temp - n;
        methodA(x, y);
        sum = x + y[0] + super.sum;
        System.out.println(x + " " + y[0] + " " + sum);
    }
}
// ---------------------------------------------
class Tester {
    public static void main(String[] args) {
        int x[] = { 23 };
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        a1.methodA(1, x);
        b2.methodB(3, 2);
        a1.methodA(1, x);
    }
}

// Outputs:
/*
    26 -2 29
    3 -10 -5
    -5 -3 -13
    34 -4 59
 */