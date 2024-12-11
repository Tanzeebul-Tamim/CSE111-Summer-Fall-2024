package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task3;

public class Test3 {
    int x = 2, y = 4, sum = 3;
    int arr[] = { x, y, sum };

    public void methodA(int x) {
        arr[0] += methodB(y, this.x) + methodC(x);
        System.out.println(x + " " + this.x + " " + sum);
        arr[1] += this.x * (++y) / (sum % x);
        System.out.println(y + " " + sum + " " + this.x);
        arr[2] += methodC(x) + methodB(this.x, sum);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }

    public int methodB(int q, int n) {
        int arr2[] = { 7, 8 };
        int a = (arr2[0]++) - q;
        int b = (++arr2[1]) - n;
        return a + b;
    }

    public int methodC(int z) {
        z = sum + methodB(x, sum) - z;
        return z / 2;
    }
}
