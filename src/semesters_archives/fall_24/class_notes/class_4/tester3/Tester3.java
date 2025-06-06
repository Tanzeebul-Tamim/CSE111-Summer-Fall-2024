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

package semesters_archives.fall_24.class_notes.class_4.tester3;

public class Tester3 {
    public static void main(String[] args) {
        // Creating two Customer objects (c1 and c2) and setting their fields directly
        Customer c1 = new Customer();
        c1.name = "Name-1";
        c1.age = 23;

        Customer c2 = new Customer();
        c2.name = "Name-2";
        c2.age = 24;

        // Commented code to display each customer's name and age individually
        // System.out.println("Customer1:"+c1.name+" ("+c1.age+")");
        // System.out.println("Customer2:"+c2.name+" ("+c2.age+")");

        // Calling show() method on each customer object to print their information
        c1.show();
        c2.show();

        // Printing the default toString() representation of each Customer object
        System.out.println(c1); // Outputs the memory reference for c1
        System.out.println(c2); // Outputs the memory reference for c2

        // Creating an array of 5 Customer objects to act as a database
        Customer[] database = new Customer[5];

        // Populating the 'database' array with Customer objects and setting each
        // customer’s fields
        for (int i = 0; i < database.length; i++) {
            database[i] = new Customer(); // Initializing a new Customer object
            database[i].name = "Name-" + (i + 1); // Assigning name based on the index
            database[i].age = 27 + i; // Incrementing age to provide unique values
        }

        // Printing all customers in the 'database' array with their default toString()
        // representation
        System.out.println("Full Database:");
        for (int i = 0; i < database.length; i++)
            System.out.println(database[i]); // Prints the memory references for each Customer object

        // Displaying detailed information of each customer using the show() method
        for (int i = 0; i < database.length; i++) {
            database[i].show(); // Calls show() to output name and age of each customer
        }
    }
}
