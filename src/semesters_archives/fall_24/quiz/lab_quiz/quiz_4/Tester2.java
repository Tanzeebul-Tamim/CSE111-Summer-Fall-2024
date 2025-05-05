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

/*
    Question: Design the Vehicle and Garage classes so that the Tester2 class produces the given outputs.

    Restriction: Garage class can't have more than 1 array.

    Output:
    
    A vehicle has been created
    1-----------------------
    Garage Name: The Parking Spot
    Total Vehicles: 0
    Cars:
    Bikes:
    2-----------------------
    3-----------------------
    Car no 123-XYZ has been parked!
    Bike no 567-MPH has been parked!
    4-----------------------
    Garage Name: The Parking Spot
    Total Vehicles: 2
    Cars:
    Number: 123-XYZ, Brand: Toyota
    Bikes:
    Number: 567-MPH, Brand: Yamaha
    5-----------------------
    Car no 281-WRH has been parked!
    No more space!
    6-----------------------
    Garage Name: The Parking Spot
    Total Vehicles: 3
    Cars:
    Number: 123-XYZ, Brand: Toyota
    Number: 281-WRH, Brand: Honda
    Bikes:
    Number: 567-MPH, Brand: Yamaha
    7-----------------------
    Car no 281-WRH has left the garage!
    8-----------------------
    Garage Name: The Parking Spot
    Total Vehicles: 2
    Cars:
    Number: 123-XYZ, Brand: Toyota
    Bikes:
    Number: 567-MPH, Brand: Yamaha
 */

public class Tester2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("123-XYZ", "Toyota", "Car");
        System.out.println("1-----------------------");
        Garage g1 = new Garage();
        g1.info();
        System.out.println("2-----------------------");
        Vehicle v3 = new Vehicle("567-MPH", "Yamaha", "Bike");
        Vehicle v4 = new Vehicle("281-WRH", "Honda", "Car");
        System.out.println("3-----------------------");
        g1.parkVehicle(v2);
        g1.parkVehicle(v3);
        System.out.println("4-----------------------");
        g1.info();
        System.out.println("5-----------------------");
        g1.parkVehicle(v4);
        g1.parkVehicle(v1);
        System.out.println("6-----------------------");
        g1.info();
        System.out.println("7-----------------------");
        g1.removeVehicle(v4);
        System.out.println("8-----------------------");
        g1.info();
    }
}
