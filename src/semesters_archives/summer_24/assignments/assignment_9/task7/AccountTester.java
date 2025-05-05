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

package semesters_archives.summer_24.assignments.assignment_9.task7;

public class AccountTester {
    public static void main(String[] args) {
        System.out.println("Total account holders: " + Account.count);
        System.out.println("1================");
        Account p1 = new Account("Abdul", 45, "Service Holder", 500000);
        p1.addMoney(300000);
        p1.printDetails();
        System.out.println("2================");
        Account p2 = new Account("Rahim", 55, "Businessman", 700000);
        p2.withdrawMoney(700000);
        p2.printDetails();
        System.out.println("3================");
        Account p3 = new Account("Ashraf", 62, "Govt.Officer", 200000);
        p3.withdrawMoney(250000);
        p3.printDetails();
        System.out.println("4================");
        System.out.println("Total account holders: " + Account.count);

    }
}
