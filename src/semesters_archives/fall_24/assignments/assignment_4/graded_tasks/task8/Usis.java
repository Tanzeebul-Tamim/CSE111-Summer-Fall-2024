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

package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task8;

public class Usis {
    private Student[] users;
    private int totalAdvisee;

    public Usis() {
        System.out.println("Usis is ready to use!");
        this.users = new Student[5];
    }

    public void login(Student user) {
        if (user.email == null || user.password == null) {
            System.out.println("Email and password need to be set.");
        } else {
            System.out.println("Login successful");
            user.updateLoginStatus("Logged-in");
        }
    }

    public void advising(Student user, String... courses) {
        if (user.getLoginStatus() == null) {
            System.out.println("Please login to advise courses!");
        } else {
            if (courses == null) {
                System.out.println("You haven't selected any courses.");
            } else {
                if (courses.length > 3) {
                    System.out.println("You need special approval to take more than 3 courses.");
                } else {
                    user.courses = courses;
                    this.users[this.totalAdvisee++] = user;

                    System.out.println("Advising successful!");
                }
            }
        }
    }

    public void advising(Student user) {
        String[] courses = null;
        this.advising(user, courses);
    }

    public void allAdviseeInfo() {
        System.out.printf("Total Advisee: %d\n", this.totalAdvisee);

        for (Student user : this.users) {
            if (user != null) {
                System.out.printf("Name: %s ID: %d\n", user.name, user.id);
                System.out.printf("Department: %s\n", user.department);
                System.out.println("Advised Courses:");

                for (String course : user.courses) {
                    if (course != null) {
                        System.out.print(course + " ");
                    }
                }

                System.out.println("\n==============");
            }
        }
    }
}
