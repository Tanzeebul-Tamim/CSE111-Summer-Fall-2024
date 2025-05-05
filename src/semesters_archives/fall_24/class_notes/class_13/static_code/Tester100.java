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

package semesters_archives.fall_24.class_notes.class_13.static_code;

// Class to test the Calculator class functionality
public class Tester100 {
    public static void main(String[] args) {
        System.out.println("- - - - - - - - - - -");
        System.out.print("Calculator.add(3, 42) = ");
        System.out.println(Calculator.add(3, 42)); // Test the add method
        System.out.println("Memory: " + Calculator.getMemory()); // Display the current memory value
        System.out.println("- - - - - - - - - - -");
        System.out.print("Calculator.square(22) = ");
        System.out.println(Calculator.square(22)); // Test the square method
        System.out.println("Memory: " + Calculator.getMemory()); // Display the current memory value
        System.out.println("- - - - - - - - - - -");
        System.out.print("Calculator.halfOf(memory) = ");
        System.out.println(Calculator.halfOf(Calculator.getMemory())); // Test the halfOf method
        System.out.println("- - - - - - - - - - -");

        Calculator c1 = new Calculator(2, 5); // Create an instance of Calculator
        System.out.println("C1 = " + c1); // Display the instance

        Calculator c2 = Calculator.makeCalculator(-4, 1); // Test the factory method
        System.out.println("C2 = " + c2); // Display the instance created or null

        System.out.println("C1: " + c1.x + ", " + c1.y); // Display instance variables of c1
        if (c2 != null) {
            System.out.println("C2: " + c2.x + ", " + c2.y); // Display instance variables of c2 (if valid)
        } else {
            System.out.println("C2 is null"); // Handle null case for c2
        }
    }
}
