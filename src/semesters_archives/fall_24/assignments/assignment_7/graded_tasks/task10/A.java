package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task10;

@SuppressWarnings("static-access")
public class A {
    public static int temp = 10;

    public int sum = 1;
    public int y = 2, x = 11;

    public A() {
        y = temp - 2;
        sum = temp + 3;
        temp -= 2;
    }

    public void methodA(int m, int n) {
        int x = 0;
        y = y + m + (this.temp++);
        x = x + 2 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }
}
