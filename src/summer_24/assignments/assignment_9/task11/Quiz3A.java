package summer_24.assignments.assignment_9.task11;

public class Quiz3A {
    public static int temp = 4;
    public static int y;
    public int sum;

    public Quiz3A() {
        int y = 7;
        y = temp - 1;
        sum = Quiz3A.temp + 1 + y;
        temp += 2;
    }

    public Quiz3A(int k) {
        temp = temp++;
        sum = ++temp + k;
        Quiz3A.y = (sum++) - 1;
        System.out.println(Quiz3A.y + " " + temp + " " + y);
    }

    @SuppressWarnings("static-access")
    public int methodB(int m, int n) {
        int x = 0;
        y = this.y + m + (++temp);
        x = x + 2 + n;
        sum = sum + x + y;
        System.out.println(x + " " + this.y + " " + sum);
        return sum;
    }
}
