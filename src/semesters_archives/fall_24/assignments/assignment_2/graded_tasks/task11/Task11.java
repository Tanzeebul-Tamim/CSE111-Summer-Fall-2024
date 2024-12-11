package semesters_archives.fall_24.assignments.assignment_2.graded_tasks.task11;

public class Task11 {
    public int p = 3, y = 2, sum;

    public void methodA() {
        int x = 0, y = 0;
        y = y + this.y;
        x = sum + 2 + p;
        sum = x + y + methodB(p, y);
        System.out.println(x + " " + y + " " + sum);
    }

    public int methodB(int p, int n) {
        int x = 0;
        y = y + (++p);
        x = x + 2 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
        return sum;
    }
}
