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

package semesters_archives.summer_24.class_notes.jun_26_arrays_and_oop_introduction;

import java.util.Arrays;

public class Tester1 {
    public static void main(String[] args) {
        int[][] area1 = { { 3, 4, 5 }, { 2, -1 }, { 9, 2, 7, 6 } };

        /*
         * In Java, a hash code is a numerical value that is used to uniquely
         * identify objects during operations. We can consider them as their unique
         * addresses on memory/memory reference.
         * 
         * If we use toString() on an array, we get a string representation that
         * includes the type of the array and its hash code.
         */

        System.out.println(Arrays.toString(area1)); // printing the reference of the 2D array
        for (int i = 0; i < area1.length; i++) {
            // ! Don't confuse area[i].toString() with Arrays.toString(area[i])
            System.out.println(Arrays.toString(area1[i])); // printing each inner arrays individually
        }

        /*
         * Initializing a 2 dimensional array and printing it
         * 
         * When you initialize an array in Java, its elements are automatically set to
         * their default values. For an array of integers (int), the default value is 0.
         * This is why you see 0 in the arrays when you print them.
         */

        int[][] area2 = new int[3][4];
        System.out.println(Arrays.toString(area2)); // printing the reference of the 2D array
        for (int i = 0; i < area2.length; i++) {
            System.out.println(Arrays.toString(area2[i])); // Output [0, 0, 0, 0]
        }

        /*
         * Initializing a 2 dimensional array and then initializing a linear array for
         * the each element of the 2D array
         * Then using an inner loop, assigning values to the inner arrays
         */

        String[][] area3 = new String[3][0];
        for (int i = 0; i < area3.length; i++) {
            area3[i] = new String[5];
            for (int j = 0; j < area3[i].length; j++) {
                area3[i][j] = "r" + i + " " + "c" + j;
            } // ^ ^--- column number / inner array index
              // ^------ row number / outer array index
        }

        // printing each inner linear arrays individually after assigning values to them
        for (int i = 0; i < area3.length; i++)
            System.out.println(Arrays.toString(area3[i]));

    }
}