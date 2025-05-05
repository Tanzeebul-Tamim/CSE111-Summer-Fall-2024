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

package semesters_archives.fall_24.term_exams.final_exam.inheritance;

/*
    Question:

    Given the classes below, your task is to design 1 child class: RainReport with necessary attributes and methods, such that the given output is generated.

    Based on the weather attributes Rainfall amount will be adjusted.
        ● Thunderstorm increases rainfall by 25%.
        ● Greater than 20 km/h wind reduces rainfall by 10%.
        ● Greater than 70% humidity increases rainfall by 20%.

    After adjusting the new rainfall amount following statements should be printed:
        ● Rainfall Amount greater than 50 should print "Due to heavy rainfall, this area can face a flood situation."
        ● Rainfall Amount greater than 30 should print "The area will face Moderate rainfall."
        ● Other cases should print "The are will face Light rainfall."

    Expected Output:

    --------1--------
    Weather Report:
    Temperature: 25.5 Celsius
    Humidity: 65.0%
    Wind Speed: 15.0 km/h
    --------2--------
    Weather Report:
    Temperature: 22.3 Celsius
    Humidity: 80.0%
    Wind Speed: 10.0 km/h
    Original Rainfall Amount: 60.5 mm
    Adjusted Rainfall Amount: 90.75 mm
    Thunderstorm: Yes
    --------3--------
    Due to heavy rainfall, this area can face a flood situation.
    --------4--------
    The area will face Light rainfall.
    --------5--------
    The area will face Moderate rainfall.
    --------6--------
    Comparing Weather Reports:
    Temperature Difference: 3.1999999999999993 Celsius
    Humidity Difference: 15.0%
    WindSpeed Difference: 5.0 km/h
    --------7--------
    Comparing Weather Reports:
    Temperature Difference: 4.300000000000001 Celsius
    Humidity Difference: 26.0%
    WindSpeed Difference: 57.0 km/h
    Comparing Rain Reports:
    Actual Rainfall Difference: 45.5 mm
    Adjusted Rainfall Difference: 77.25 mm
 */

public class Tester {
    public static void main(String[] args) {
        WeatherReport gp = new WeatherReport(25.5, 65, 15);
        System.out.println("--------1--------");
        gp.displayReport();

        System.out.println("--------2--------");
        RainReport rp1 = new RainReport(22.3, 80, 10, 60.5, true);
        RainReport rp2 = new RainReport(18.0, 54, 67, 15.0, false);
        RainReport rp3 = new RainReport(20.0, 70, 26, 30.0, true);

        rp1.displayReport();

        System.out.println("--------3--------");
        rp1.rainfallStatus();

        System.out.println("--------4--------");
        rp2.rainfallStatus();

        System.out.println("--------5--------");
        rp3.rainfallStatus();

        System.out.println("--------6--------");
        gp.compareWith(rp1);

        System.out.println("--------7--------");
        rp1.compareWith(rp2);
    }
}
