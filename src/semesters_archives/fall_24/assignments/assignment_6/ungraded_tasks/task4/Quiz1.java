package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task4;

public class Quiz1 {
    public static int temp = 4;
    public int sum;
    public int y;

    public Quiz1() {
        y = temp - 1;
        sum = temp + 1;
        temp += 2;
    }

    public Quiz1(int p) {
        y = temp + p;
        sum = p + temp + 1;
        temp -= 1;
    }

    public void methodA() {
        int x = 0, y = 0;
        y = y + this.y;
        x = this.y + 2 + temp;
        sum = x + y + methodB(x, y);
        System.out.println(x + " " + y + " " + sum);
    }

    public int methodB(int m, int n) {
        int x = 0;
        y = y + m + (++temp);
        x = x + 2 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
        return sum;
    }
}
