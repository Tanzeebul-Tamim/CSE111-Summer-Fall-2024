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

package semesters_archives.fall_24.class_notes.class_11;

// Class to represent a bus
public class Bus {
    // Instance variables to store bus details
    public String location; // Current location of the bus
    public Passenger[] passengers; // Array to hold passengers on the bus
    public int passIndex; // Index to track the number of passengers
    public String number; // Bus number or identifier

    // Constructor to initialize bus details
    public Bus(String busNo, String place) {
        this.number = busNo; // Set the bus number
        this.location = place; // Set the initial location of the bus
        this.passIndex = 0; // Initialize the passenger index
        this.passengers = new Passenger[5]; // Initialize the passenger array with a capacity of 5
    }

    // Method to update the bus location and handle passenger destinations
    public void reachPlace(String d) {
        this.location = d; // Update the current location of the bus
        Passenger[] newPassengers = new Passenger[this.passengers.length]; // Temporary array for remaining passengers
        int newIndex = 0; // Index for the new passenger array

        // Loop through current passengers to process arrivals
        for (int i = 0; i < passIndex; i++) {
            // Check if the passenger's destination matches the bus location
            if (this.passengers[i].destination.equals(d)) {
                System.out.println(this.passengers[i].name + " has arrived at " + d + "."); // Notify arrival
                this.passengers[i].onBus = null; // Remove bus reference from passenger
                this.passengers[i].location = d; // Update passenger location
            } else {
                newPassengers[newIndex++] = this.passengers[i]; // Keep the passenger on the bus
            }
        }

        // Update the passenger list with remaining passengers
        this.passengers = newPassengers;
    }
}
