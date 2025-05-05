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

package semesters_archives.fall_24.class_notes.class_3;

import java.util.Scanner; // Importing Scanner class to take user input

public class tester3 {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creating a Scanner object 's' for reading input

        // Prompting the user to input the number of lines to be read
        System.out.print("Input length: ");
        int len = s.nextInt(); // Reads an integer input to determine the length of the array 'arr'

        // Declaring a String array 'arr' of size 'len' to store the user inputs
        String[] arr = new String[len];

        String dummy = s.nextLine(); // Consumes the leftover newline character after reading the integer input

        // Using a for-loop to fill the array with 'len' lines of input from the user
        for (int i = 0; i < len; i++) {
            arr[i] = s.nextLine(); // Reads each line of input and stores it in the 'arr' array
        }

        // Displaying each element of the array with a numbered label
        for (int i = 0; i < len; i++) {
            System.out.println("Course " + (i + 1) + ": " + arr[i]); // Prints each entry in 'arr' prefixed by "Course"
                                                                     // and the entry number
        }
    }
}
