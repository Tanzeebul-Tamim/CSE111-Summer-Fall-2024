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

public class Tester {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int i; // Declaration only (Memory is allocated for variable 'i')
        i = 5; // Initialization (Assigning a value to 'i')

        int j = 10; // Declaration and Initialization in one statement
        int[] a = { 5, 6 }; // 'a' is declared and initialized with elements 5, 6 in one statement

        int[] b = new int[3]; // Declaration and initialization of array 'b' (memory allocated for 3 elements
                              // but not assigned values yet)
        int[] c; // Declaration only; memory for 'c' elements is not allocated yet

        /* These are Allowed */
        b[0] = 2; // Assigning values to each element of array 'b'
        b[1] = 3;
        b[2] = 4;

        /* This is NOT ALLOWED */
        // c = {2, 3, 4}; // Not allowed because array literals require declaration;
        // cannot assign literal to an already-declared array without 'new' keyword

        /* This is Allowed */
        c = new int[] { 2, 3, 4 }; // Allowed, since the 'new' keyword allocates memory for elements; assigning
                                   // values during initialization
    }
}
