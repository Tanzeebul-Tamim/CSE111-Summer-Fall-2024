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

package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task4;

public class Student {
  private int id;
  private double cgpa;
  private String[] courses;
  private int courseCount;

  public Student(int id) {
    this(id, 0);
  }

  public Student(int id, double cgpa) {
    this.id = id;
    this.storeCG(cgpa);
    this.courses = new String[4];

    if (this.cgpa == 0) {
      System.out.format("A student with ID %d has been created.\n", this.id);
    } else {
      System.out.format("A student with ID %d and cgpa %.1f has been created.\n", this.id, this.cgpa);
    }
  }

  public void storeID(int id) {
    this.id = id;
  }

  public void storeCG(double cgpa) {
    if (cgpa > 4 || cgpa < 0) {
      System.out.println("Invalid CGPA");
    } else {
      this.cgpa = cgpa;
    }
  }

  public void addCourse(String course) {
    if (cgpa == 0) {
      System.out.printf("Failed to add %s\nSet CG first\n", course);
    } else {
      if (this.cgpa < 3 && this.courseCount == 3) {
        System.out.printf("Failed to add %s\n", course);
        System.out.println("CG is low. Can't add more than 3 courses.");
      } else if (this.courseCount == this.courses.length) {
        System.out.printf("Failed to add %s\n", course);
        System.out.println("Maximum 4 courses allowed.");
      } else {
        this.courses[this.courseCount++] = course;
      }
    }
  }

  public void addCourse(String[] courses) {
    for (String course : courses) {
      this.addCourse(course);
    }
  }

  public void showAdvisee() {
    System.out.printf("Student ID: %d, CGPA: %.1f\n", this.id, this.cgpa);

    if (this.courseCount > 0) {
      System.out.println("Added courses are:");

      for (String course : this.courses) {
        if (course != null) {
          System.out.print(course + " ");
        }
      }

      System.out.println();
    } else {
      System.out.println("No courses added.");
    }
  }

  public void removeAllCourse() {
    this.courseCount = 0;
    this.courses = new String[4];
  }
}
