package summer_24.assignments.assignment_7.task9;

public class Trace1 {
    public int[] q;
    public int x, y;

    public Trace1(int[] p) {
        this.q = p;
        System.out.println(q[1] + " " + q[2] + " " + q[3]);
    }

    public int m2(int a, int b) {
        x = b++;
        y = ++a / x;
        q[x] = b + q[x];
        if (b % 2 == 0) {
            q[b] = x;
            System.out.println(q[a] + " " + y + " " + x);
            this.m1(b, a);
        } else {
            System.out.println(x + " " + y + " " + q[x]);
        }
        return x + y;
    }

    public void m1(int x, double y) {
        this.y = (int) y;
        System.out.println(q[x] + " " + (++x) + " " + y);
        m2(this.y, x - 1);
    }
}
