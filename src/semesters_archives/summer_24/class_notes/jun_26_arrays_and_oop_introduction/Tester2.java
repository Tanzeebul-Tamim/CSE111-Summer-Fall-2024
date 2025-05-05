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

public class Tester2 {
    public static void main(String[] args) {
        String[][] database = new String[3][2];
        // 3 rows/customers, 2 data per customers (name and email)
        for (int i = 0; i < database.length; i++) {
            database[i][0] = "Name-" + (i + 1);
            database[i][1] = "Email-" + (i + 1);
        }
        System.out.println("Full Database:");
        for (int i = 0; i < database.length; i++)
            System.out.println(Arrays.toString(database[i]));

        String[] customer = database[2];
        System.out.println("First Customer:");
        System.out.println(Arrays.toString(customer));

    }
}
