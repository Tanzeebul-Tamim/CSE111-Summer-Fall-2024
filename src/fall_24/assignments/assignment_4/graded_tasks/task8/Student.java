package fall_24.assignments.assignment_4.graded_tasks.task8;

public class Student {
    public String name;
    public int id;
    public String department;

    public String[] courses;
    private String loginStatus;
    
    public String email;
    public String password;

    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.courses = new String[4];

        this.email = null;
        this.password = null;
        this.loginStatus = null;

        System.out.println("Student object is created");
    }

    public void updateLoginStatus(String status) {
        this.loginStatus = status;
    }

    public String getLoginStatus() {
        return this.loginStatus;
    }
}
