package semesters_archives.fall_24.class_notes.class_13.tracing;

public class TracingTask {
    public static void main(String args[]) {
        Trace m1 = new Trace();
        m1.methodA();
    }
}

class Trace {
    public static int x = 7;
    public static int y = 4;
    public int m = 5;

    @SuppressWarnings("static-access")
    public void methodA() {
        int m = 0, x = 9;
        m = methodB(this.m - 3) + x;
        this.x = ++x;
        System.out.println(this.x + " " + Trace.methodB(m));
    }

    public static int methodB(int y) {
        Trace.y = y * y;
        System.out.println(x + " " + y);
        return x - 11;
    }

}

// Outputs:
/*
    7 2
    10 5
    10 -1
 */
