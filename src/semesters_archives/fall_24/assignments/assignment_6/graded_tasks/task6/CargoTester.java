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

package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task6;

public class CargoTester {
    public static void main(String[] args) {
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("1====================");
        Cargo a = new Cargo("Industrial Machinery", 4.5);
        a.details();
        System.out.println("2====================");
        a.load();
        System.out.println("3====================");
        Cargo b = new Cargo("Steel Ingot", 2.7);
        b.details();
        System.out.println("4====================");
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("5====================");
        b.load();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("6====================");
        Cargo c = new Cargo("Tree Trunks", 3.6);
        c.load();
        System.out.println("7====================");
        c.details();
        b.details();
        System.out.println("8====================");
        Cargo d = new Cargo("Processed Goods", 1.8);
        d.load();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("9====================");
        b.unload();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
        System.out.println("10====================");
        c.load();
        System.out.println("11====================");
        b.details();
        System.out.println("Cargo Capacity: " + Cargo.capacity());
    }
}
