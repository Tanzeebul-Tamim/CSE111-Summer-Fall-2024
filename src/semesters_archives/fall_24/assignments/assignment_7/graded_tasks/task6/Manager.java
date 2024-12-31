package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task6;

public class Manager extends Employee {
    private int bonus;
    private double finalSalary;

    public Manager(String name, double baseSalary, int hoursWorked, int bonus) {
        super(name, baseSalary, hoursWorked);
        this.bonus = bonus;
    }

    public void calculateSalary() {
        int hoursWorked = this.getHoursWorked();
        double baseSalary = this.getBaseSalary();

        if (hoursWorked > 40) {
            this.finalSalary = baseSalary + baseSalary * this.bonus / 100;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Bonus: %.1f %%\n", (double) this.bonus);
        System.out.printf("Final Salary: $%.1f\n", this.finalSalary);
    }

    public void requestIncrement(double amount) {
        int hoursWorked = this.getHoursWorked();
        amount = hoursWorked > 100 ? amount : hoursWorked > 80 ? amount / 2 : 0;

        if (amount == 0) {
            System.out.println("Increment denied.");
        } else {
            double baseSalary = this.getBaseSalary();
            this.setBaseSalary(baseSalary + amount);
            System.out.printf("$%.0f Increment approved.\n", amount);
        }
    }
}
