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

package semesters_archives.fall_24.class_notes.class_12.student;

// Class to test the Student class
public class Tester {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Student s1 = new Student(); // Create the first student instance
        s1.name = "Asif"; // Assign the name "Asif" to the first student
        s1.register(); // Register the first student, assigning a unique ID
        System.out.println(s1.totalCount); // Display the total student count

        Student s2 = new Student(); // Create the second student instance
        s2.name = "Arif"; // Assign the name "Arif" to the second student
        s2.register(); // Register the second student, assigning a unique ID
        
        // Notice that the total student count is same for both Student instance
        System.out.println(s1.totalCount); // Display the total student count from the first student's perspective
        System.out.println(s2.totalCount); // Display the total student count from the second student's perspective
    }
}
