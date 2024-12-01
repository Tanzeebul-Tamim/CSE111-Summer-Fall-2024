package summer_24.assignments.assignment_9.task10;

public class Test3 {
    int x = 2, y = 4, z = 5;
    double p = 0.0;

    public void methodA(int x, int m) {
        this.x = methodC(this.x);
        p = x + this.x % m * 3.0;
        y = y + methodB(x, this.x);
        System.out.println(this.x + " " + x + y + " " + p);
    }

    public int methodB(int q, int n) {
        int arr[] = { 3, 4, 5 };
        arr[0] = arr[0] + this.x + n;
        arr[1] = q + arr[1];
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        return arr[1] + arr[2];
    }

    public int methodC(int y) {
        if (y % 2 == 0) {
            int temp = methodB(2, y);
            return temp;
        } else {
            return 4;
        }
    }
}
