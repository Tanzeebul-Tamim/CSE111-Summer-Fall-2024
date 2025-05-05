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

package semesters_archives.fall_24.class_notes.class_15;

// Parent class for Child1 and Child2, with common behavior
public class Parent {
    int a = 5; // Instance variable 'a' common to Parent

    // Constructor to initialize a Parent object
    Parent() {
        System.out.println("Creating Parent Object"); // Confirm creation of Parent object
    }

    // Method that prints a message and the value of 'a' from Parent
    public void method() {
        System.out.println("Parent method call"); // Indicate method call
        System.out.println("a = " + this.a); // Print value of 'a' from Parent
    }

    // Override the toString method to describe the Parent class object
    public String toString() {
        return super.toString() + "\nThis is Parent Object"; // Append Parent specific info
    }
}
