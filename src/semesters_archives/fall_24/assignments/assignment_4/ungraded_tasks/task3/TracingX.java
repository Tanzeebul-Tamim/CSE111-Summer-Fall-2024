package semesters_archives.fall_24.assignments.assignment_4.ungraded_tasks.task3;

public class TracingX {
    public int x, y = 1;

    public int metA(int y) {
        y += x + 3;
        int temp = y + this.y;
        if (temp % 2 == 0) {
            return temp;
        }
        TracingX t = new TracingX();
        t.y = this.x - (++x) + t.x;
        this.y = y + t.metA(t.x);
        System.out.println(x + " " + y + " " + temp);
        return temp + this.y;
    }
}
