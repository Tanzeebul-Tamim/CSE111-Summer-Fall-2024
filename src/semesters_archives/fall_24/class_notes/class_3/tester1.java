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

import java.util.Scanner; // Importing Scanner class to enable input from the user

public class tester1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in); // Creating a Scanner object 's' to read input from the console

        int i = s.nextInt();
        int j = s.nextInt();

        // Next line reads any remaining text from the current line after integer input
        // or moves to next line if no text remains.
        String st1 = s.nextLine(); // Reading the rest of the line including any whitespaces after integers; often
                                   // used to move to a fresh line

        String st2 = s.next(); // Reading the next word (string up to whitespace) and assigning it to 'st2'

        // Output section
        System.out.println("i = " + (i)); // Printing the value of 'i'
        System.out.println("j = " + (j)); // Printing the value of 'j'
        System.out.println("st1 = " + (st1)); // Printing the value of 'st1', which might be empty due to the prior line
                                              // read
        System.out.println("st2 = " + (st2)); // Printing the value of 'st2'3
    }
}
