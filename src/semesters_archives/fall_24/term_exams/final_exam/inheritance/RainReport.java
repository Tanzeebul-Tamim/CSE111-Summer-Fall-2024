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

public class RainReport extends WeatherReport {
    private double originalRainfall;
    private double adjustedRainfall;
    private boolean thunderstorm;

    public RainReport(double temperature, double humidity, double windSpeed, double originalRainfall,
            boolean thunderstorm) {
        super(temperature, humidity, windSpeed);
        this.originalRainfall = originalRainfall;
        this.thunderstorm = thunderstorm;
        this.calc();
    }

    @Override
    public void displayReport() {
        super.displayReport();
        System.out.printf("Original Rainfall Amount: %.1f mm\n", this.originalRainfall);
        System.out.printf("Adjusted Rainfall Amount: %.2f mm\n", this.adjustedRainfall);
        System.out.printf("Thunderstorm: %s\n", this.thunderstorm ? "Yes" : "No");
    }
    
    @Override
    public void compareWith(RainReport other) {
        double actualDifference = Math.abs(this.originalRainfall - other.originalRainfall);
        double adjustedDifference = Math.abs(this.adjustedRainfall - other.adjustedRainfall);

        super.compareWith(other);
        System.out.println("Comparing Rain Reports:");
        System.out.printf("Actual Rainfall Difference: %.1f mm\n", actualDifference);
        System.out.printf("Adjusted Rainfall Difference: %.2f mm\n", adjustedDifference);
    }
    
    public void rainfallStatus() {
        if (this.adjustedRainfall > 50) {
            System.out.println("Due to heavy rainfall, this area can face a flood situation.");
        } else if (this.adjustedRainfall > 30) {
            System.out.println("The area will face Moderate rainfall.");
        } else {
            System.out.println("The area will face Light rainfall.");
        }
    }

    private void adjust(boolean condition, int percentage) {
        if (condition) {
            this.adjustedRainfall += this.adjustedRainfall * percentage / (double) 100;
        }
    }

    private void calc() {
        this.adjustedRainfall = this.originalRainfall;
        this.adjust(this.thunderstorm, 25);
        this.adjust(this.windSpd > 20, -10);
        this.adjust(this.humidity > 70, 20);
    }
}
