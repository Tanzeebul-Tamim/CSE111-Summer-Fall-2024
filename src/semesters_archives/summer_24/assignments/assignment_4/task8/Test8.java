package semesters_archives.summer_24.assignments.assignment_4.task8;

public class Test8 {
    public static void main(String args[]) {
        Bird b1 = new Bird();
        b1.name = "Parrot";
        b1.flyUp(3);
        b1.makeNoise();
        b1.flyDown(5);
        b1.flyDown(2);
        b1.flyDown(1);
        Bird b2 = new Bird();
        b2.name = "Eagle";
        b2.flyUp(5);
        b2.flyDown(5);
        b2.makeNoise();
    }
}
