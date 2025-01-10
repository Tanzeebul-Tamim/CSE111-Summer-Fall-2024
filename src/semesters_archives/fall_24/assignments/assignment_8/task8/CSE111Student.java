package semesters_archives.fall_24.assignments.assignment_8.task8;

public class CSE111Student extends Student {
    public String msg = "I love Java Programming";

    @Override
    public String shout() {
        return this.msg;
    }
}
