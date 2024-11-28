package fall_24.assignments.assignment_3.graded_tasks.task10;

public class Maze {
    public int x;

    public void methodA() {
        int m = 0, x = 9;
        m = methodB(m - 3) + x;
        this.x = ++x;
        System.out.println(this.x + " " + m);
        methodB(x, m);
        System.out.println(x + " " + (m + this.x));
        methodB(m);
    }

    public int methodB(int y) {
        x = y * y;
        System.out.println(x + " " + y);
        return x - 11;
    }

    public void methodB(int z, int x) {
        z = z - 2;
        x = this.x - 2 * x;
        System.out.println(z + " " + this.x);
    }
}
