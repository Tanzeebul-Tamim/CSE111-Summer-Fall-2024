package summer_24.assignments.assignment_9.task1;

public class BBAStudent extends Student {
    public BBAStudent() {
        this("Default");
    }

    public BBAStudent(String name) {
        updateName(name);
        updateDepartment("BBA");
    }
}
