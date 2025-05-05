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

package semesters_archives.summer_24.assignments.assignment_9.task6;

public class BusTester {
    public static void main(String[] args) {
        Bus b1 = new Bus(4, "Jatrabari");
        System.out.println("1--------------");
        @SuppressWarnings("unused")
        Bus b2 = new Bus(10, "Gazipur");
        System.out.println("2--------------");
        b1.addPassenger("Fahim", "Mirpur");
        System.out.println("3--------------");
        b1.addPassenger("Anika", "Jatrabari");
        System.out.println("4--------------");
        b1.addPassenger("Ali");
        System.out.println("5--------------");
        b1.addPassenger("Zafar");
        System.out.println("6--------------");
        b1.addPassenger("Mim", "Badda");
        b1.addPassenger("Nowrin");
        System.out.println("7--------------");
        b1.addPassenger("Walid", "Jatrabari");

    }
}
