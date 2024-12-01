package summer_24.assignments.assignment_9.task1;

public class Student {
    private String name = "Just a Student";
    private String department = "nothing";

    public void updateDepartment(String dpt) {
        this.department = dpt;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void details() {
        System.out.println("Name : " + name + " Department: " + department);
    }
}
