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

import java.util.Arrays; // Importing Arrays class to use array utility methods

public class Tester2 {
    public static void main(String[] args) {
        // Initializing a 2D array named 'database' with 3 rows and 2 columns
        // Each row represents a customer, with the first column as name and the second
        // as email
        String[][] database = new String[3][2];

        // Populating the 'database' with names and emails using a loop
        for (int i = 0; i < database.length; i++) {
            database[i][0] = "Name-" + (i + 1); // Assigns a name to each customer in the first column
            database[i][1] = "Email-" + (i + 1); // Assigns an email to each customer in the second column
        }

        // Commented code for printing all database contents for reference:
        // System.out.println("Full Database:");
        // for (int i = 0; i < database.length; i++)
        // System.out.println(Arrays.toString(database[i])); // Prints each customer's
        // data as a String

        // Creating a reference to the third customer (row index 2) in 'database'
        String[] ektaCustomer = database[2];

        System.out.println("Single Customer:");
        System.out.println(Arrays.toString(ektaCustomer)); // Displays data of the third customer

        // Modifying the 'name' of the third customer in 'ektaCustomer' reference
        ektaCustomer[0] = "Arif";

        // Displaying updated 'ektaCustomer' data after the name change
        System.out.println("copy:" + Arrays.toString(ektaCustomer));

        // Printing the main 'database' to observe that it reflects the name change for
        // the third customer
        System.out.print("Main:");
        for (int i = 0; i < database.length; i++)
            System.out.println(Arrays.toString(database[i])); // Shows all customer entries in the main database

    }
}
