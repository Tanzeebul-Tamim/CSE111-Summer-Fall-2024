package summer_24.assignments.assignment_5.task1;

public class Course {
    public String cName;
    public String code;
    public int credit;

    public void createCourse(String cName, String code, int credit) {
        this.cName = cName;
        this.code = code;
        this.credit = credit;
    }

    public void displayCourse() {
        System.out.printf("Course Name: %s\n", this.cName);
        System.out.printf("Course Code: %s\n", this.code);
        System.out.printf("Course Credit: %s\n", this.credit);
    }

    public void updateCourse(String cName, String code, int credit) {
        createCourse(cName, code, credit);
    }
}
