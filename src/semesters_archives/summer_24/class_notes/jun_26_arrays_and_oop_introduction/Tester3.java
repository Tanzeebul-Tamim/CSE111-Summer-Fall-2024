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

public class Tester3 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = "Name-1";
        c1.age = 23;
        Customer c2 = new Customer();
        c2.name = "Name-2";
        c2.age = 24;

        System.out.println("Customer1:" + c1.name + " (" + c1.age + ")");
        System.out.println("Customer2:" + c1.name + " (" + c1.age + ")");

        Customer[] database = new Customer[5];
        for (int i = 0; i < database.length; i++) {
            database[i] = new Customer();
            database[i].name = "Name-" + (i + 1);
            database[i].age = 27 + (i);
        }
        System.out.println("Full Database:");
        for (int i = 0; i < database.length; i++)
            System.out.println(database[i]);

        c1.show();

        for (int i = 0; i < database.length; i++) {
            database[i].show();
        }
    }
}
