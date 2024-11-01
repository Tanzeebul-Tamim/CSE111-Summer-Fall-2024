package summer_24.assignments.assignment_7.task1;

public class Student {
    String name;
    String prog;

    Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }

    void updateName(String name) {
        this.name = name;
    }

    void updateProgram(String prog) {
        this.prog = prog;
    }

    String accessName() {
        return this.name;
    }

    String accessProgram() {
        return this.prog;
    }
}
