package semesters_archives.fall_24.assignments.assignment_8.task11;

@SuppressWarnings("static-access")
public class A {
    public static int temp = 3;
    public int sum;
    public int y;

    public A(int x) {
        y = A.temp - 1 + x;
        sum = this.temp + 2;
        A.temp -= 2;
    }

    public void methodA(int y, int[] n) {
        int x = 0;
        n[0] += 1;
        this.y = this.y + y + temp;
        A.temp += 1;
        x = x + 2 + n[0];
        n[0] = sum + 2;
        System.out.println(x + " " + this.y + " " + this.sum);
    }
}
