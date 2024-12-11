package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task10;

public class msgClass {
    public int content;
}

class FinalT5A {
    public int sum = 2, y = 1, x = 1;

    public void methodA() {
        int x = 6, y = 0;
        msgClass myMsg = new msgClass();
        myMsg.content = this.x;
        x = x + myMsg.content;
        this.y = this.y + methodB(myMsg, myMsg.content);
        System.out.println(x + " " + this.y + " " + sum);
        y = this.y / 2 + this.x;
        x = y + sum / 2;
        sum = x + y + myMsg.content;
        System.out.println(x + " " + y + " " + sum);
    }

    public int methodB(msgClass mg2, int mg1) {
        int x = 0;
        y = y + mg2.content;
        mg2.content = y + mg1;
        x = this.x + 3 + mg1;
        sum = sum + x + y;
        System.out.println(this.x + " " + this.y + " " + sum);
        mg2.content = sum - mg1;
        return sum;
    }
}
