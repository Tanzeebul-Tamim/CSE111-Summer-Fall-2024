/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package semesters_archives.summer_24.assignments.assignment_5.task3;

public class Employee {
    private String name;
    private float salary;
    private String designation;

    public Employee() {
        salary = 30000;
        designation = "junior";
    }

    public void newEmployee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.printf("Employee Name: %s\n", this.name);
        System.out.printf("Employee Salary: %.1f Tk\n", this.salary);
        System.out.printf("Employee Designation: %s\n", this.designation);
    }

    public void promoteEmployee(String designation) {
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

    public void calculateTax() {
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