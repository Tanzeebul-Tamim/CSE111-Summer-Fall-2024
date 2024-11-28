package fall_24.assignments.assignment_3.graded_tasks.task6;

public class Student {
    private String name;
    private String department;
    private double cgpa;
    private int credits;
    private String scholarship;

    public Student() {
        this.name = this.scholarship = "Not Set";
        this.department = "CSE";
        this.credits = 9;
    }

    public void showDetails() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Department: %s\n", this.department);
        System.out.printf("CGPA: %.2f\n", this.cgpa);
        System.out.printf("Credits: %d\n", this.credits);
        System.out.printf("Scholarship Status: %s scholarship\n",
                this.scholarship.equals("Not Set") ? "No" : this.scholarship);
    }

    public void updateDetails(String name, double cgpa, int credits, String department) {
        this.name = name;
        this.cgpa = cgpa;
        this.credits = credits;
        this.department = department;

        if (this.cgpa >= 3.5 && this.credits > 10) {
            if (this.cgpa >= 3.7) {
                this.scholarship = "Merit based";
            } else {
                this.scholarship = "Need based";
            }
        }
    }

    public void updateDetails(String name, double cgpa, int credits) {
        updateDetails(name, cgpa, credits, this.department);
    }

    public void updateDetails(String name, double cgpa) {
        updateDetails(name, cgpa, this.credits, this.department);
    }

    public void checkScholarshipEligibility() {
        if (this.scholarship.equals("Not Set")) {
            System.out.printf("%s is not eligible for scholarship\n", this.name);
        } else {
            System.out.printf("%s is eligible for %s scholarship\n", this.name, this.scholarship);
        }
    }
}
