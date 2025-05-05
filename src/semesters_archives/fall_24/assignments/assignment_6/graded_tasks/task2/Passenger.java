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

package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task2;

public class Passenger {
    protected static int no_of_passenger;
    protected static double total_fare;

    private String name;
    private double distance;
    private double baggage;
    private double fare;

    protected Passenger(String name, double distance) {
        this.name = name;
        this.distance = distance;
        this.fare = calculateFare(this.distance);
        total_fare += this.fare;
        no_of_passenger++;
    }

    protected void storeBaggageWeight(double baggage) {
        total_fare -= this.fare;
        this.baggage = baggage;
        this.fare = calculateFare(this.distance, this.baggage);
        total_fare += this.fare;
    }

    private double calculateFare(double distance) {
        return calculateFare(distance, 0);
    }

    private double calculateFare(double distance, double baggage) {
        return distance * 20 + baggage * 10;
    }

    protected void passengerDetails() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Fare: %.1f TK\n", this.fare);
    }
}
