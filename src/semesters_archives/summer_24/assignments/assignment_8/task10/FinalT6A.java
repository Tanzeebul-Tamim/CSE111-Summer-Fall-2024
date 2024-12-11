package semesters_archives.summer_24.assignments.assignment_8.task10;

public class FinalT6A {
    public static int temp = 3;
    public int sum;
    public int y = 2;

    public FinalT6A(int x, int p) {
        temp += 3;
        y = temp - p;
        sum = temp + x;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodA() {
        int x = 0, y = 0;
        y = y + this.y;
        x = this.y + 2 + temp;
        sum = x + y + methodB(temp, y);
        System.out.println(x + " " + y + " " + sum);
    }

    public int methodB(int temp, int n) {
        int x = 0;
        y = y + (++temp);
        x = x + 2 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
        return sum;
    }
}
