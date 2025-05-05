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

package semesters_archives.fall_24.class_notes.class_4;

import java.util.Arrays; // Importing Arrays utility class for array manipulations

public class Tester1 {
    public static void main(String[] args) {

        // Commented example arrays are left for reference and experimentation:

        // Creating a 2D integer array with different row sizes (jagged array)
        // int[][] area1 = {{3, 4, 5}, {2, -1}, {9, 2, 7, 6}};
        // System.out.println(Arrays.toString(area1)); // Prints memory address
        // for (int i = 0; i < area1.length; i++) {
        // System.out.println(Arrays.toString(area1[i])); // Prints each row in 'area1'
        // as a String
        // }

        // Creating a 2D integer array with fixed row and column size of [3][4]
        // int[][] area2 = new int[3][4];
        // System.out.println(Arrays.toString(area2)); // Prints memory address
        // for (int i = 0; i < area2.length; i++) {
        // System.out.println(Arrays.toString(area2[i])); // Prints each row initialized
        // to 0
        // }

        // Initializing a 2D String array 'area3' with 3 rows and 0 columns (empty inner
        // arrays)
        String[][] area3 = new String[3][0];
        area3 = new String[5][]; // Reassigning 'area3' to a new array of 5 rows with unspecified column size

        // Prints outer array structure (5 null elements since columns are not
        // initialized)
        System.out.println("Before: " + Arrays.toString(area3));

        // Attempting to fill each row of 'area3' with values
        for (int i = 0; i < area3.length; i++) {
            String[] inner = area3[i]; // Assigns each row array (currently null) to 'inner'
            for (int j = 0; j < area3[i].length; j++) {
                inner[j] = "r" + i + " c" + j; // Populates 'inner' with row and column labels
                // Each entry is labeled as "r<row> c<column>" to denote position in the array
            }
        }

        // Prints outer array structure, still showing uninitialized rows
        System.out.println("After: " + Arrays.toString(area3));

        // Prints each row (this will show 'null' for each row in 'area3' as the inner
        // arrays were not initialized)
        for (int i = 0; i < area3.length; i++)
            // Prints individual rows (null elements for uninitialized inner arrays)
            System.out.println(Arrays.toString(area3[i]));
    }
}
