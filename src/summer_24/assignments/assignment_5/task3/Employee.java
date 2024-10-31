package summer_24.assignments.assignment_5.task3;

public class Employee {
    private String name;
    private float salary;
    private String designation;

    Employee() {
        salary = 30000;
        designation = "junior";
    }

    void newEmployee(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.printf("Employee Name: %s\n", this.name);
        System.out.printf("Employee Salary: %.1f Tk\n", this.salary);
        System.out.printf("Employee Designation: %s\n", this.designation);
    }

    void promoteEmployee(String designation) {
        System.out.printf("%s has been promoted to %s\n", name, designation);

        if (designation.equals("senior")) {
            salary += 25000;
        } else if (designation.equals("lead")) {
            salary += 50000;
            this.designation = "lead";
        } else if (designation.equals("manager")) {
            salary += 75000;
        } else {
            System.out.println("Invalid designation!");
            return;
        }

        this.designation = designation;

        System.out.printf("New Salary: %.2f Tk\n", this.salary);
    }

    void calculateTax() {
        float tax;

        if (this.salary > 50000) {
            tax = this.salary * 30 / 100;
        } else if (this.salary <= 50000 && this.salary > 30000) {
            tax = this.salary * 10 / 100;
        } else {
            System.out.println("No need to pay tax");
            return;
        }

        System.out.printf("%s Tax Amount %.2f Tk\n", this.name, tax);
    }
}