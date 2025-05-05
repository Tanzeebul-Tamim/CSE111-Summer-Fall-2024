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

package semesters_archives.fall_24.quiz.lab_quiz.quiz_4;

public class Garage {
    private Vehicle[] vehicles;
    private int count;

    public Garage() {
        this.vehicles = new Vehicle[3];
    }

    public void parkVehicle(Vehicle vehicle) {
        if (count < 3) {
            vehicle.index = this.count;
            this.vehicles[this.count++] = vehicle;

            System.out.printf("%s no %s has been parked!\n", vehicle.type, vehicle.number);
        } else {
            System.out.println("No more space!");
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles[vehicle.index] = null;
        this.count--;

        System.out.printf("%s no %s has left the garage!\n", vehicle.type, vehicle.number);
    }

    public void info() {
        System.out.println("Garage Name: The Parking Spot");
        System.out.printf("Total Vehicles: %d\n", this.count);

        printVehicles("Car");
        printVehicles("Bike");
    }

    private void printVehicles(String type) {
        System.out.println(type + "s:");

        for (Vehicle vehicle : this.vehicles) {
            if (vehicle != null) {
                if (vehicle.type.equals(type)) {
                    System.out.printf("Number: %s, Brand: %s\n", vehicle.number, vehicle.brand);
                }
            }
        }
    }
}
