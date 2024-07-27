package practice_or_rough_works.july_03_tracing;

public class Mid {
    public int x;
    public int y;
    public int sum;

    public void setMethod(int[] a) {
        this.x = a[1];
        this.y = a[2];
        this.sum = 100;
    }

    public void methodA(int[] s) {
        this.y += this.sum + this.x;
        this.sum = s[1] + s[2];
        Mid f = new Mid();
        f.setMethod(new int[] { 3, 12, this.x });
        f.sum = this.sum + this.methodB(f);
        System.out.println(this.x + " " + this.y + " " + this.sum);
    }

    public int methodB(Mid n) {
        int y = 7;
        n.x = this.x + this.sum;
        n.sum = n.x + n.y + y;
        System.out.println(n.x + " " + n.y + " " + n.sum);
        return n.x;
    }

    public static void main(String[] args) {
        int[] a = { 2, 7, -2, -5 };
        Mid m = new Mid();
        m.setMethod(a);
        m.methodA(new int[] { -1, 1, -3 });
        System.out.println(m.methodB(m));
    }
}
