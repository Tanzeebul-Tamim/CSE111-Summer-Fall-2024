package semesters_archives.fall_24.assignments.assignment_2.graded_tasks.task5;

public class Course {
    private String title;
    private String code;
    private int credit;

    public void displayCourse() {
        System.out.printf("Course Name: %s\n", this.title);
        System.out.printf("Course Code: %s\n", this.code);
        System.out.printf("Course Credit: %d\n", this.credit);
    }

    public void updateDetails(String title, String code, int credit) {
        this.title = title;
        this.code = code;
        this.credit = credit;
    }
}
