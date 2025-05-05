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

package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task4;

public class CustomerTester {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.createCustomer("John");
        System.out.println("1=====================");
        c1.showCart();
        System.out.println("2=====================");
        c1.addItem("Apple", 2);
        c1.addItem("Orange", 5);
        c1.addItem("Bread", 5);
        c1.addItem("Milk", 3);
        c1.addItem("Eggs", 2);
        System.out.println("3=====================");
        c1.showCart();
        System.out.println("4=====================");
        c1.calculatePrice();
        System.out.println("5=====================");
        Customer c2 = new Customer();
        c2.createCustomer("Jane");
        c2.addItem("Apple", 2, "Orange", 5);
        c2.addItem("Chocolates", 15, "Bread", 5);
        c2.addItem("Milk", 3);
        System.out.println("6=====================");
        c2.showCart();
        System.out.println("7=====================");
        c2.calculatePrice();
    }
}
