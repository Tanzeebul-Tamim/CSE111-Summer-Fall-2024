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

package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task2;

public class TravelTester {
    public static void main(String[] args) {
        System.out.println("No. of Traveller = " + Travel.getCount());
        System.out.println("1================");

        Travel t1 = new Travel("Dhaka", "India");
        System.out.println(t1.displayTravelInfo());
        System.out.println("2================");

        Travel t2 = new Travel("Kuala Lampur", "Dhaka");
        t2.setTime(23);
        System.out.println(t2.displayTravelInfo());
        System.out.println("3================");

        Travel t3 = new Travel("Dhaka", "New_Zealand");
        t3.setTime(15);
        t3.setDestination("Germany");
        System.out.println(t3.displayTravelInfo());
        System.out.println("4================");

        Travel t4 = new Travel("Dhaka", "India");
        t4.setTime(9);
        t4.setSource("Malaysia");
        t4.setDestination("Canada");
        System.out.println(t4.displayTravelInfo());
        System.out.println("5================");

        System.out.println("No. of Traveller = " + Travel.getCount());
    }
}
