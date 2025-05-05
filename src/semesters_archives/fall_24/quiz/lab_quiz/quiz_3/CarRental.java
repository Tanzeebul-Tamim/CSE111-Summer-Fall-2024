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

package semesters_archives.fall_24.quiz.lab_quiz.quiz_3;

public class CarRental {
    private String name;
    private String location;
    private String[] carTypes;
    private int[] availability;

    public CarRental() {
        this.name = "Unnamed";
        this.location = "Default";
        this.carTypes = new String[] { "Sedan", "SUV", "Hatchback", "Luxury", "Van" };
        this.availability = new int[] { 20, 15, 16, 5, 8 };
    }

    public void printDetails() {
        System.out.printf("Car Rental Name: %s\n", this.name);
        System.out.printf("Location: %s\n", this.location);

        for (int i = 0; i < this.carTypes.length; i++) {
            String carType = this.carTypes[i];
            int count = this.availability[i];

            System.out.printf("Available number of %s: %d\n", carType, count);
        }
    }

    public String updateDetails(String name, String location) {
        this.name = name;
        this.location = location;

        return "Name and location have been updated.";
    }

    public void rentCar(int count, String carType) {
        boolean found = false;
        int idx = -1;

        for (int i = 0; i < this.carTypes.length; i++) {
            String type = this.carTypes[i];

            if (type.equals(carType)) {
                found = true;
                idx = i;
                break;
            }
        }

        if (found) {
            if (count > this.availability[idx]) {
                System.out.printf("%d %s cars are not available. Cannot rent.\n", count, carType);
            } else {
                System.out.printf("Successfully rented %d %s cars.\n", count, carType);
                this.availability[idx] -= count;
            }
        } else {
            System.out.printf("We don't have any %s cars for rent.\n", carType);
        }
    }

    public void rentCar(String carType) {
        this.rentCar(5, carType);
    }
}
