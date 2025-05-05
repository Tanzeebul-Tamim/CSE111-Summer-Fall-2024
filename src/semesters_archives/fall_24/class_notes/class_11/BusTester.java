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

// Tester class to demonstrate the interaction between Bus and Passenger classes
public class BusTester {
    // Main method to test the functionality of the Bus and Passenger classes
    public static void main(String[] args) {
        // Create a bus starting at Badda
        Bus bus1 = new Bus("Bus-1", "Badda");

        // Create a passenger with destination Rampura
        Passenger p1 = new Passenger("Akib", "Badda", "Rampura");
        p1.getOnBus(bus1); // Attempt to board the bus
        System.out.println("1================="); // Section divider for clarity

        // Create another passenger with destination Mohakhali
        Passenger p2 = new Passenger("Samin", "Rampura", "Mohakhali");
        p2.getOnBus(bus1); // Attempt to board the bus
        System.out.println("2================="); // Section divider for clarity

        p1.getOnBus(bus1); // Akib attempts to board again
        System.out.println("3================="); // Section divider for clarity

        // Create a second bus starting at Rampura
        Bus bus2 = new Bus("Bus-2", "Rampura");
        p2.getOnBus(bus2); // Samin attempts to board the second bus
        p1.getOnBus(bus2); // Akib attempts to board the second bus
        System.out.println("4================="); // Section divider for clarity

        // Update the location of the first bus to Rampura
        bus1.reachPlace("Rampura");

        // Change Akib's destination and attempt to board again
        p1.destination = "Mohakhali";
        p1.getOnBus(bus2);
        System.out.println("5================="); // Section divider for clarity

        // Update the location of the second bus to Mohakhali
        bus2.reachPlace("Mohakhali");
    }
}