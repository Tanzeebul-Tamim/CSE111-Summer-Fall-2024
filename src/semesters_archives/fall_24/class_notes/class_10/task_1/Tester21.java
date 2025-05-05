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

public class Tester21 {
    // Main method to test the Programmer class functionality
    public static void main(String[] args) {
        // Create a Programmer object (Junior Software Engineer) with initial salary
        Programmer joy = new Programmer("Joy", "Junior Software Engineer", 50000);
        System.out.println("1===================="); // Section divider for clarity

        // Add skills to the programmer
        joy.setSkill("c++", "java"); // Add two skills
        joy.setSkill("c#", "python"); // Add two more skills
        joy.showInfo(); // Display the programmer's information

        System.out.println("2===================="); // Section divider for clarity

        // Create another Programmer object (Software Engineer) with initial salary
        Programmer anik = new Programmer("Anik", "Software Engineer", 60000);
        System.out.println("3===================="); // Section divider for clarity

        // Add multiple skills to the programmer
        anik.setSkill("c++", "java", "python"); // Add three skills
        anik.setSkill("c#", "ruby", "swift"); // Add three more skills
        anik.showInfo(); // Display the programmer's information

        System.out.println("4===================="); // Section divider for clarity

        // Create a Programmer object (Senior Software Engineer) without an initial
        // salary
        Programmer luna = new Programmer("Luna", "Senior Software Engineer");

        // Add skills to the programmer
        luna.setSkill("c++", "java", "ruby"); // Add three skills
        luna.showInfo(); // Display the programmer's information

        System.out.println("5===================="); // Section divider for clarity

        // Update the salary for the programmer
        luna.setSalary(70000); // Set the salary to 70000
        System.out.println("6===================="); // Section divider for clarity

        // Display the updated programmer information
        luna.showInfo();
    }
}