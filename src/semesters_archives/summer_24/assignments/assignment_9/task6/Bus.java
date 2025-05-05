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

package semesters_archives.summer_24.assignments.assignment_9.task6;

public class Bus {
    private int capacity;
    private String destination;
    private int count;

    public Bus(int capacity, String destination) {
        this.capacity = capacity;
        this.destination = destination;

        System.out.printf("Capacity: %d\n", this.capacity);
        System.out.printf("Destination: %s\n", this.destination);
    }

    public void addPassenger(String passenger, String destination) {
        if (this.destination.equals(destination)) {
            if (this.count < this.capacity) {
                count++;
                System.out.printf("%s is added to the bus.\n", passenger);
            } else {
                System.out.println("Bus is full.");
            }
        } else {
            System.out.printf("Sorry %s! The bus won't stop at %s\n", passenger, destination);
            System.out.println("Use another bus.");
        }
    }

    public void addPassenger(String passenger) {
        count++;
        System.out.printf("%s is added to the bus.\n", passenger);
        System.out.printf("%s will get off at the last stop\n", passenger);
    }
}
