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

package semesters_archives.summer_24.assignments.assignment_5.task4;

public class Tester4 {
    public static void main(String[] args) {
        MoneyTracker tr1 = new MoneyTracker();
        System.out.println(tr1.info());
        tr1.createTracker("John");
        System.out.println("1 ==========");
        System.out.println(tr1.info());
        System.out.println("2 ==========");
        tr1.income(1000);
        System.out.println(tr1.info());
        System.out.println("3 ==========");
        tr1.expense(800);
        tr1.expense(100);
        System.out.println(tr1.info());
        System.out.println("4 ==========");
        tr1.showHistory();
        System.out.println("5 ==========");
        tr1.expense(101);
        System.out.println("6 ==========");
        tr1.expense(200);
        System.out.println("7 ==========");
        tr1.income(200);
        tr1.showHistory();
        System.out.println("8 ==========");
    }

}
