package semesters_archives.summer_24.assignments.assignment_7.task1;

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

    public String accessName() {
        return this.name;
    }

    public String accessProgram() {
        return this.prog;
    }
}
