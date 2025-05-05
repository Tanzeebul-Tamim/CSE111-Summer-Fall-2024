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

package semesters_archives.fall_24.class_notes.class_10.task_1;

// Class to represent a Programmer with name, job title, salary, and skills
public class Programmer {
    // Instance variables to hold programmer details
    public String name; // Name of the programmer
    public String job; // Job designation
    public double salary; // Programmer's salary
    public String skills; // Programmer's skills stored as a comma-separated string

    // Constructor to initialize Programmer with name, job, and salary
    public Programmer(String n, String j, double s) {
        this.name = n; // Set the programmer's name
        this.job = j; // Set the job designation
        this.salary = s; // Set the salary
        System.out.println("Programmer created successfully.");
    }

    // Method to add two skills to the programmer
    public void setSkill(String s1, String s2) {
        // Check if skills already exist, then append new skills; otherwise, initialize
        if (this.skills != null) {
            this.skills += "," + s1 + "," + s2;
        } else {
            this.skills = s1 + "," + s2;
        }
    }

    // Overloaded method to add three skills to the programmer
    public void setSkill(String s1, String s2, String s3) {
        // Check if skills already exist, then append new skills; otherwise, initialize
        if (this.skills != null) {
            this.skills += "," + s1 + "," + s2 + "," + s3;
        } else {
            this.skills = s1 + "," + s2 + "," + s3;
        }
    }

    // Method to display the programmer's details
    public void showInfo() {
        System.out.println("Name: " + this.name); // Print name
        System.out.println("Designation: " + this.job); // Print job designation
        if (this.salary > 0) { // Check if salary is set
            System.out.println("Salary: " + this.salary);
        } else {
            System.out.println("Salary: Pending for HR approval");
        }
        System.out.println("Skills: " + this.skills); // Print skills
    }

    // Constructor to initialize Programmer with name and job; default salary is 0
    public Programmer(String name, String job) {
        this(name, job, 0.0);
    }

    // Method to update the salary of the programmer
    public void setSalary(double s) {
        this.salary = s; // Set the new salary
    }
}

// Programmer created successfully.
// 1====================
// Name: Joy
// Designation: Junior Software Engineer
// Salary: 50000.0
// Skills: c++,java,c#,python
// 2====================
// Programmer created successfully.
// 3====================
// Name: Anik
// Designation: Software Engineer
// Salary: 60000.0
// Skills: c++,java,python,c#,ruby,swift
// 4====================
// Programmer created successfully.
// Name: Luna
// Designation: Senior Software Engineer
// Salary: Pending for HR approval
// Skills: c++,java,ruby
// 5====================
// 6====================
// Name: Luna
// Designation: Senior Software Engineer
// Salary: 70000.0
// Skills: c++,java,ruby