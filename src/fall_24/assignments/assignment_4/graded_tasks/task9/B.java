package fall_24.assignments.assignment_4.graded_tasks.task9;

public class B {
    public int x = 3, y = 5, temp = -5, sum = 2;

    public B() {
        y = temp + 3;
        sum = 3 + temp + 2;
        temp -= 2;
    }

    public B(B b) {
        sum = b.sum;
        x = b.x + 2;
        b.methodB(2, 3);
    }

    public void methodA(int m, int n) {
        int x = 2;
        y = y + m + (temp++);
        x = x + 5 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB(int m, int n) {
        int y = 0;
        y = y + this.y;
        x = this.y + 2 + temp;
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y + " " + sum);
    }
}
