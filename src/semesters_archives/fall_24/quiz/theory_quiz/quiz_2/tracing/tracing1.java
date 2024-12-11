package semesters_archives.fall_24.quiz.theory_quiz.quiz_2.tracing;

public class tracing1 {
    public static void main(String[] args) {
        MidTest p = new MidTest();
        int[] r = { 3, 0, 7 };
        p.method(5, 1);
        p.r = r;
        r[0] = p.method(p.a + p.b);
    }
}

class MidTest {
    int a = 7, b = 6;
    int[] r = { 5, 2 };

    int method(int n) {
        n += b - 1;
        this.b = (++r[(n + b) % 2]) - r[1];
        a = r[0] + r[1];
        System.out.printf("%d %d %d\n", a, b, n);
        return a + this.b;
    }

    void method(int n, int a) {
        r[1] = a + b;
        r[0] += this.r[a] + this.method(r[0]);
        b += this.a - (n++);
        System.out.printf("%d %d %d\n", a, b, n);
    }
}

// Outputs:
/*
 * 13 -1 10
 * 1 7 6
 * 4 0 26
 */