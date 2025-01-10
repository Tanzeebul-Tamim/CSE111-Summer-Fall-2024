package semesters_archives.fall_24.assignments.assignment_8.task8;

public class CSEStudent extends Student {
    public String msg = "I want to transfer to CSE";

    @Override
    public String shout() {
        return this.msg;
    }
}
