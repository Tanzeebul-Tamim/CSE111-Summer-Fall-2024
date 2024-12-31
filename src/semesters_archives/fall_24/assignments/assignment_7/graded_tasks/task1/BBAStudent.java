package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task1;

public class BBAStudent extends Student {
    public BBAStudent() {
        this("Default");
    }

    public BBAStudent(String name) {
        setName(name);
        setDepartment("BBA");
    }
}
