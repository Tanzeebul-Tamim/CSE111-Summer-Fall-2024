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

package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task5;

public class TaxiLagbe {
    private String taxiNo;
    private String area;
    private int passengerCount;
    private String[] passengers;
    private int totalFare;

    public void storeInfo(String taxiNo, String area) {
        this.taxiNo = taxiNo;
        this.area = area;
        this.passengers = new String[4];
    }

    public void addPassenger(String name, int fare) {
        if (this.passengerCount >= 4) {
            System.out.println("Taxi Full! No more passengers can be added");
        } else {
            this.passengers[this.passengerCount++] = name;
            this.totalFare += fare;
            System.out.format("Dear %s! Welcome to TaxiLagbe\n", name);
        }
    }

    public void addPassenger(String name1, int fare1, String name2, int fare2) {
        addPassenger(name1, fare1);
        addPassenger(name2, fare2);
    }

    public void printDetails() {
        System.out.format("Taxi number: %s\n", this.taxiNo);
        System.out.format("This taxi can cover %s area\n", this.area);
        System.out.format("Total Passenger: %d\n", this.passengerCount);

        System.out.println("Passenger Lists:");

        for (String passenger : this.passengers) {
            if (passenger != null) {
                System.out.print(passenger + " ");
            }
        }

        if (this.passengerCount != 0) {
            System.out.println();
        }

        System.out.printf("Total collected fare: %d Taka\n", this.totalFare);
    }

}
