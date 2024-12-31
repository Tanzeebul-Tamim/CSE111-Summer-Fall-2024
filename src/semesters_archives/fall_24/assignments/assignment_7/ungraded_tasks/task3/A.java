package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task3;

public class A {
    public static int temp = 4;
    public static int x = -10;
    
    public int sum = 0;
    public int y = 0;

    public A() {
        y = temp - 2;
        sum = temp + 1;
        temp -= 2;
    }

    public void methodA(int m, int n) {
        int x = 0;
        y = y + m + (temp++);
        x = x + 1 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }
}
