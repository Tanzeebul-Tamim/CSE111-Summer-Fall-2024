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

package semesters_archives.fall_24.class_notes.class_5;

public class Series {
    // Instance variables to store the series details
    public String name;
    public int year;
    public String status;

    // Method to set the details of the series
    public void newShow(String n, int y, String s) {
        name = n; // Sets the name of the series
        year = y; // Sets the release year of the series
        status = s; // Sets the current status of the series (e.g., "Completed", "Ongoing")
    }

    // Method to return the details of the series as a formatted string
    public String details() {
        String out = "Series Name: " + name; // Concatenates the series name
        out += "\nRelease year: " + year; // Concatenates the release year
        out += "\nStatus: " + status; // Concatenates the series status
        return out; // Returns the formatted details
    }
}
