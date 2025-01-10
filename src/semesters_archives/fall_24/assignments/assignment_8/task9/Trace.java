package semesters_archives.fall_24.assignments.assignment_8.task9;

class Quiz5 {
    public int sum = 12, x = 2, y = 6;
    public Trace trace;

    public Quiz5(Trace t) {
        trace = t;
        int x = trace.temp + y;
        sum = sum + (t.sum--) + y;
        System.out.println(trace.sum + " " + sum + " " + x);
        sum -= 10;
    }

    public void methodA(int sum, int temp) {
        sum = 3 + sum - trace.sum;
        x = sum + 12 + y;
        y = trace.temp + temp + sum;
        this.sum = y + methodB(trace.temp, trace) + trace.temp;
        System.out.println(sum + " " + y + " " + this.sum);
    }

    public int methodB(int x, Trace temp) {
        int sum = x + temp.sum + this.x;
        temp.temp = sum + this.sum;
        System.out.println(x + " " + temp.temp + " " + sum);
        return sum;
    }
}

public class Trace {
    public int sum, temp;

    public Trace(int sum, int temp) {
        this.sum = sum;
        this.temp = temp;
    }

    public static void main(String[] args) {
        Trace p = new Trace(3, 4);
        Quiz5 q = new Quiz5(p);
        q.methodA(4, 8);
        q.methodA(5, 10);

    }
}

// Outputs:
/*
    2 21 10
    4 40 29
    5 17 86
    40 163 77
    6 56 296
 */