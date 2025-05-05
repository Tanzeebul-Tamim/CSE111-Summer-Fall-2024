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

package semesters_archives.fall_24.class_notes.class_2;

import java.util.Arrays; // Importing Arrays utility class to use built-in methods for array operations

public class arrays {
    public static void main(String[] args) {

        // Declaring and initializing a double array 'a' with two elements
        double[] a = { 5, 6 };

        // Declaring an integer array 'c'
        int[] c;
        // Initializing array 'c' with specific values after declaration
        c = new int[] { 21, 9, 7 };

        // Using Arrays.toString() to print contents of array 'a'
        System.out.println(Arrays.toString(a)); // Outputs the array in readable format: [5.0, 6.0]

        // Attempting to print array 'c' directly using c.toString()
        System.out.println(c.toString()); // Outputs the array's memory address instead of its content: [I@7a81197d

        /*
         * Note:
         * Arrays.toString(array) is used to get a readable string representation of the
         * array elements.
         * Calling toString() directly on an array (without Arrays.toString) only
         * returns the memory address, not the contents, because arrays do not override
         * Object's toString() method for element display.
         */
    }
}
