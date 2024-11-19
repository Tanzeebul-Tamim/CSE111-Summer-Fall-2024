package fall_24.assignments.assignment_2.graded_tasks.task8;

public class Employee {
    private String name;
    private double salary;
    private String designation;
    private double tax;

    Employee() {
        this.salary = 30000;
        this.designation = "junior";
    }

    public void newEmployee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.format("Employee Name: %s\n", this.name);
        System.out.format("Employee Salary: %.1f Tk\n", this.salary);
        System.out.format("Employee Designation: %s\n", this.designation);
    }

    public void calculateTax() {
        if (this.salary > 30000) {
            if (this.salary > 50000) {
                this.tax = (salary / 100) * 30;
            } else {
                this.tax = (salary / 100) * 10;
            }

            System.out.format("%s Tax Amount: %.2f Tk\n", this.name, this.tax);
        } else {
            System.out.println("No need to pay tax");
        }
    }

    public void promoteEmployee(String designation) {
        if (designation.equals("senior")) {
            this.salary += 25000;
        } else if (designation.equals("lead")) {
            this.salary += 50000;
        } else if (designation.equals("manager")) {
            this.salary += 75000;
        }
        this.designation = designation;
        System.out.format("%s has been promoted to %s\n", this.name, this.designation);
        System.out.format("New Salary: %.2f Tk\n", this.salary);
    }
}
