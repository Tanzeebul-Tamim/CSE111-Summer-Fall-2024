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

package semesters_archives.summer_24.assignments.assignment_8.task1;

public class PassengerTester {
    public static void main(String args[]) {
        System.out.println("Total Passenger: " + Passenger.no_of_passenger);
        System.out.println("Total Fare: " + Passenger.total_fare + " TK");
        System.out.println("==========1==========");
        Passenger p1 = new Passenger("Lara", 5.6);
        p1.passengerDetails();
        System.out.println("==========2==========");
        Passenger p2 = new Passenger("Kevin", 10.0);
        p2.setBaggageWeight(6.8);
        p2.passengerDetails();
        System.out.println("==========3==========");
        Passenger p3 = new Passenger("Robin", 2.3);
        p3.setBaggageWeight(5);
        p3.passengerDetails();
        System.out.println("==========4==========");
        System.out.println("Total Passenger: " + Passenger.no_of_passenger);
        System.out.println("Total Fare: " + Passenger.total_fare + " TK");
    }
}
