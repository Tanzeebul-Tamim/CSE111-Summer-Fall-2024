package semesters_archives.fall_24.quiz.lab_quiz.quiz_6;

public class ChildClass extends ParentClass {
    public int temp;
    private int b, x;

    public ChildClass() {
        super(10);
        b = b + 3;
        x = 4;
    }

    public ChildClass(ChildClass c) {
        super(c.x);
        b = c.b + 1;
        x = 4;
        c.methodA(x);
        super.methodA(4);
    }

    @Override
    public void methodA(int b) {
        temp += b;
        b = getA() + x;
        System.out.println(getA() + " " + b + " " + temp);
    }
}
