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

package semesters_archives.summer_24.assignments.assignment_6.task6;

public class Course {
    private String name;
    private String code;
    private String[] syllabus;
    private int contentCount;

    public Course() {
        this.name = "";
        this.code = "";
        this.syllabus = new String[4];
    }

    public void createCourse(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public void addOneContent(String content) {
        if (contentCount < 4) {
            syllabus[contentCount++] = content;
            System.out.printf("%s was added.\n", content);
        } else {
            System.out.println("Cannot add more content.");
        }
    }

    public void addTwoContent(String content1, String content2) {
        this.addOneContent(content1);
        this.addOneContent(content2);
    }

    public void printDetails() {
        System.out.println("Course Details:");
        System.out.printf("Course Name: %s\n", this.name);
        System.out.printf("Course Code: %s\n", this.code);
        System.out.println("Course Syllabus:");

        if (contentCount == 0) {
            System.out.println("No content yet.");
        } else if (contentCount > 0) {
            for (int i = 0; i < syllabus.length; i++) {
                String content = syllabus[i];
                if (content != null) {
                    System.out.print(content);

                    if (this.contentCount > 1 && i != this.syllabus.length - 1) {
                        System.out.print(", ");
                    }
                }

            }

            System.out.println();
        }

    }
}
