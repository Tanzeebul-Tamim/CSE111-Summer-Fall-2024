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

package semesters_archives.summer_24.assignments.assignment_9.task7;

public class Account {
    public static int count;

    private String name;
    private int age;
    private String occupation;
    private int balance;

    public Account(String name, int age, String occupation, int deposit) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.balance = deposit;
        count++;
    }

    public void addMoney(int deposit) {
        this.balance += deposit;
    }

    public void printDetails() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Age: %d\n", this.age);
        System.out.printf("Occupation: %s\n", this.occupation);
        System.out.printf("Total Amount: %d\n", this.balance);
    }

    public void withdrawMoney(int withdraw) {
        if (withdraw <= this.balance) {
            this.balance -= withdraw;
        } else {
            System.out.println("Insufficient money for withdrawal!");
        }
    }
}
