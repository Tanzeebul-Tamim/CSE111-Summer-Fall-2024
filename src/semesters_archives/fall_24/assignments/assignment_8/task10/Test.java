package semesters_archives.fall_24.assignments.assignment_8.task10;

@SuppressWarnings("static-access")
class Tracing {
    public static int a = 9, y = 5;
    public int x, b;

    public Tracing(int a, int b) {
        x += a;
        y += b;
        this.a = this.x;
        this.b = this.y;
    }

    public int methodB() {
        System.out.println(this.a + " " + this.b + " " + x);
        b = y - this.b + Test.a;
        x += this.b;
        return this.b;
    }
}

@SuppressWarnings("static-access")
public class Test {
    public static int a = 3;
    public int b = 7, c;

    public Test() {
        methodA(a + 4);
    }

    public void methodA(int a) {
        Tracing t = new Tracing(2, 7);
        a = Tracing.a + Test.a;
        c = b + a + t.methodB();
        System.out.println(this.a + " " + this.b + " " + c);
    }

    public static void main(String[] args) {
        Tracing t2 = new Tracing(4, 3);
        Test ex = new Test();
        t2.methodB();
        ex.methodA(Test.a);
    }
}

// Outputs:
/*
    2 15 2
    3 7 15
    2 8 4
    2 22 2
    3 7 15
 */