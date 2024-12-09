package fall_24.term_exams.mid_term.tracing;

public class MidA {
    public int temp = 3, z = 2, sum;

    public void m1() {
        int x = 3, temp = -1;
        x = sum + 4 + z++;
        temp += this.temp;
        sum = this.temp + m2(sum, x) + this.temp;
        System.out.println(x + " " + temp + " " + sum);
    }

    public int m2(int x, int sum) {
        temp = x;
        int temp = 6;
        temp = ++this.temp + z + this.z;
        x = sum + (temp++) + temp;
        sum = this.sum + x + this.temp;
        System.out.println(x + " " + temp + " " + sum);
        return this.temp--;
    }
}
