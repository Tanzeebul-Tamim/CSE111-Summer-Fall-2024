package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task1;

public class Student {
    public String name;
    public String prog;

    public Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateProgram(String prog) {
        this.prog = prog;
    }

    public String accessProgram() {
        return this.prog;
    }
}
