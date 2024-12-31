package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task6;

public class Developer extends Employee {
    private String language;
    private double finalSalary;

    public Developer(String name, double baseSalary, int hoursWorked, String language) {
        super(name, baseSalary, hoursWorked);
        this.language = language;
        this.finalSalary = this.getBaseSalary();
    }

    public void calculateSalary() {
        finalSalary = this.language.equals("Java") ? finalSalary += 700 : finalSalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Language: %s\n", this.language);
        System.out.printf("Final Salary: $%.1f\n", this.finalSalary);
    }
}
