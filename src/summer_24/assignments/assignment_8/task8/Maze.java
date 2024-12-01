package summer_24.assignments.assignment_8.task8;

public class Maze {
    public static int x;

    public void methodA() {
        int m = 5;
        x = 11;
        System.out.println(x + " " + m);
        m = methodB(m - 3) + x;
        System.out.println(x + " " + (m));
        methodB(x, m);
        System.out.println(x + " " + m + x);
    }

    public int methodB(int y) {
        x = y * y;
        System.out.println(x + " " + y);
        return x + 3;
    }

    public void methodB(int z, int x) {
        z = z - 2;
        x = x * 1 % z;
        System.out.println(z + " " + x);
    }
}
