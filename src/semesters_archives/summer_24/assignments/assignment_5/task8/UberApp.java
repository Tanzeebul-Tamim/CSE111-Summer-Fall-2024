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

package semesters_archives.summer_24.assignments.assignment_5.task8;

public class UberApp {
    private String name;
    private int age;
    private String contactNo;
    private int rideCount;
    private String[] rideHistory;

    public UberApp() {
        this.rideHistory = new String[3];
    }

    public void createProfile(String name, int age, String contactNo) {
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
    }

    public void showProfile() {
        System.out.println("Hello! This is your Profile:");
        System.out.printf("Full Name: %s\n", name);
        System.out.printf("Age: %s\n", age);
        System.out.printf("Phone Number: %s\n", contactNo);
    }

    public int remainingRides() {
        return 3 - rideCount;
    }

    public void bookRide(String destination, double distance) {
        if (rideCount < 3) {
            double fare = 30 * distance;

            System.out.printf("%s has booked a ride!\n", name);
            System.out.printf("Destination : %s\n", destination);
            System.out.printf("Fare: %.1f Taka\n", fare);

            rideHistory[rideCount++] = destination;
        } else {
            System.out.printf("%s, please update your plan to premium or wait till next month!\n", name);
        }
    }

    public void changeLocation(String destination, double distance) {
        double regularFare = 30 * distance;
        double feeAddedFare = regularFare + regularFare * 20 / 100;

        System.out.printf("%s has changed the destination of his current ride to %s\n", name, destination);
        System.out.printf("New fare after adding 20%% change fees: %.1f Taka.\n", feeAddedFare);

        rideHistory[rideCount - 1] = destination;
    }

    public void ridingHistory() {
        String locations = "";
        int visitedCount = 0;

        for (int i = 0; i < rideHistory.length; i++) {
            if (rideHistory[i] != null) {
                if (visitedCount > 0) {
                    locations += ", ";
                }
                locations += rideHistory[i];
                visitedCount++;
            }
        }

        if (visitedCount == 0) {
            System.out.printf("%s, you haven't visited anywhere this month.\n", name);
        } else {
            System.out.printf("%s, you have visited %s this month.\n", name, locations);
        }
    }

    public void resetMonth() {
        rideHistory = new String[3];
        rideCount = 0;
    }
}
