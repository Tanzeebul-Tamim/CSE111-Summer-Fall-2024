package fall_24.assignments.assignment_3.ungraded_tasks.task2;

public class Test2 {
    int x = 3, y = 1, z = -4;
    double p = 2.5;

    public void methodA(int n, int x) {
        this.x = methodB(x, n);
        p = this.x + n % x * 2.0;
        y = (z++) + methodB(z, (int) p) + (++z);
        System.out.println(this.x + " " + (n + y) + " " + (x + z));
    }

    public int methodB(int q, int n) {
        int arr[] = { 2, -5, 6 };
        arr[0] = arr[2] - this.x + n;
        arr[1] = q - arr[1];
        arr[2] = arr[q % 3] + arr[n % 2];
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        return arr[1] + arr[2] - arr[0];
    }
}
