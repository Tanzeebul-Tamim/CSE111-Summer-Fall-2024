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

package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task1;

public class MoneyTracker {
    private String name;
    private float balance;
    private float lastAdded;
    private float lastSpent;

    public void createTracker(String name) {
        this.name = name;
        this.balance = 1;
    }

    public String info() {
        String name = "Name: " + this.name;
        String balance = "Current Balance: " + this.balance;
        String result = name + "\n" + balance;
        return result;
    }

    public void income(float amount) {
        this.balance += amount;
        this.lastAdded = amount;
        System.out.println("Balance Updated!");
    }

    public void expense(float amount) {
        if (this.balance < amount) {
            System.out.println("Not enough balance.");
        } else if (this.balance == amount) {
            System.out.println("You're broke!");
        } else {
            this.balance -= amount;
            this.lastSpent = amount;
            System.out.println("Balance Updated.");
        }
    }

    public void showHistory() {
        System.out.format("Last added: %.1f\n", this.lastAdded);
        System.out.format("Last spent: %.1f\n", this.lastSpent);
    }
}
