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

package semesters_archives.fall_24.assignments.assignment_7.ungraded_tasks.task2;

public class ScienceExam extends Exam {
    private int partCount;
    private String[] parts;

    public ScienceExam(int marks, int time, String... parts) {
        super(marks);
        this.time = time;
        this.partCount = parts.length + 2;
        this.parts = parts;
    }

    @Override
    public String toString() {
        String marks = "Marks: " + this.marks;
        String time = "Time: " + this.time + " minutes";
        String parts = "Number of Parts: " + this.partCount;
        String output = marks + " " + time + " " + parts;

        return output;
    }

    @Override
    public String examSyllabus() {
        String output = super.examSyllabus();

        for (int i = 0; i < parts.length; i++) {
            String part = this.parts[i];
            output += ", " + part;
        }

        return output;
    }

    @Override
    public String examParts() {
        String output = super.examParts();
        int count = 0;

        for (String part : this.parts) {
            output += "Part " + (++count + 2) + " - " + part + "\n";
        }

        return output;
    }
}
