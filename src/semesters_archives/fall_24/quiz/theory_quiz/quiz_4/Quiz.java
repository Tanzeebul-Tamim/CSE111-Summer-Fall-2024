package semesters_archives.fall_24.quiz.theory_quiz.quiz_4;

public class Quiz {
    public static int sum = 8;
    public int y = 4;

    public Quiz(int x, int p) {
        x += 5;
        y = x - p;
        sum = Quiz.sum + method(x, y);
        System.out.println(x + " " + y + " " + sum);
    }

    public void method() {
        int x = 0, y = 0;
        y = y + this.y;
        x = this.y + 2 + sum;
        sum = method(y, x) + this.y;
        System.out.println(x + " " + y + " " + sum);
    }

    public int method(int sum, int x) {
        y += (++sum) + 3;
        x = x - 5;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Quiz q1 = new Quiz(2, 1);
        q1.method();
    }
}

// Outputs:
/*
    1 17 26
    7 17 34
    48 38 104
    53 17 142
 */