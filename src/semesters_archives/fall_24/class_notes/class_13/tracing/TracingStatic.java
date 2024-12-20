package semesters_archives.fall_24.class_notes.class_13.tracing;

public class TracingStatic {
    public static void main(String args[]) {
        int temp = 35;
        A a1 = new A();
        A a2 = new A(-5, -7);
        a1.methodA(1, temp);
        a2.methodA(1, A.temp);
        
    }
}

class A {
    public static int temp = 3;
    public static int sum = 9;
    public int y = 4, x = 0;

    public A() {
        int sum = 7;
        y = temp - 5;
        sum = temp + 2;
        temp -= 2;
        this.x = sum + temp + y;
    }

    public A(int y, int temp) {
        y = temp - 1 + x;
        sum = temp + 2 - x;
        temp -= 2;
    }

    public void methodA(int m, int n) {
        int x = 0;
        y = y + m + methodB(x, m);
        x = this.x + 2 + (++n);
        sum = sum + x + y;
        n = sum + 2;
        System.out.println(n + " " + y + " " + sum);
    }

    @SuppressWarnings("static-access")
    public int methodB(int m, int n) {
        int temp = 0;
        this.y = temp + this.y + m;
        x = this.y + 2 + temp - n;
        sum = x + temp + this.sum;
        System.out.println(temp + " " + temp + " " + sum);
        return temp;
    }
}

// Outputs:
/*
    0 0 -6
    32 -1 30
    0 0 35
    51 5 49
 */