package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task2;

public class Exam {
    public int marks;
    public int time;

    public Exam(int marks) {
        this.marks = marks;
        this.time = 60;
    }

    public String examSyllabus() {
        return "Maths, English";
    }

    public String examParts() {
        return "Part 1 - Maths\nPart 2 - English\n";
    }
}
