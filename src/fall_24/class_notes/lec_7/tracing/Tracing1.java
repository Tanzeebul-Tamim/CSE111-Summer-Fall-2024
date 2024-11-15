package fall_24.class_notes.lec_7.tracing;

public class Tracing1 {
    public static void main(String[] args) {
        Test m = new Test();
        m.n = m.m = 5;
        Test n = new Test();
        n.m = m.metA(2);
        n.n = n.metA(4);
        System.out.println(m.n + m.m + " " + n.m + " " + n.n);
    }
}

class Test {
    int m, n = 1;

    int metA(int n) {
        n += m + 3;
        int s = n + this.n;
        if (s % 2 == 0)
            return s;
        Test t = new Test();
        t.n = (++this.m) - (++m) + t.m;
        this.n = n + t.metA(t.m);
        System.out.printf("%d %d %d\n", m, n, s);
        return s + this.n;
    }
}

// Output:
/*
     7 10 15
     29 34 35
     19 29 71
 */