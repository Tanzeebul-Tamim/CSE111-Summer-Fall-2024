package random_solves.tracing.task2;

public class Quiz {
    public static int sum = 7;
    public int y = 3;

    public Quiz(int x, int p) {
        x += 6;
        y = x - p;
        sum = Quiz.sum + method(x, y);
        System.out.println(x + " " + p + " " + sum);
    }

    public void method() {
        int x = 0, y = 0;
        y = y + this.y;
        x = this.y + 2 + sum;
        sum = method(y, x) + this.y;
        System.out.println(x + " " + y + " " + sum);
    }

    public int method(int sum, int x) {
        y += (++sum) + 4;
        x = x - 5;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
        return x;
    }

    public static void main(String[] args) {
        Quiz q1 = new Quiz(3, 2);
        q1.method();
    }
}

// Outputs:
/*
    2 21 33
    9 2 9
    27 47 96
    32 21 74
 */