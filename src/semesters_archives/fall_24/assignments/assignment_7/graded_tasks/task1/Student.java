package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task1;

public class Student {
    private String name = "Just a Student";
    private String department = "nothing";

    public void setDepartment(String dpt) {
        this.department = dpt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Name : " + name + " Department: " + department);
    }
}
