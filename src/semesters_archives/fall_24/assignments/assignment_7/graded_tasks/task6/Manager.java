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
