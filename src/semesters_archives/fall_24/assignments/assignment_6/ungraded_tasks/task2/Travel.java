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

package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task2;

public class Travel {
    private static int count;

    private String source;
    private String destination;
    private int time;

    protected Travel(String source, String destination) {
        this.source = source;
        this.destination = destination;
        this.time = 1;
        count++;
    }

    protected static int getCount() {
        return count;
    }

    protected int getTime() {
        return this.time;
    }

    protected void setTime(int time) {
        this.time = time;
    }

    protected String getDestination() {
        return this.destination;
    }

    protected void setDestination(String destination) {
        this.destination = destination;
    }

    protected String getSource() {
        return this.source;
    }

    protected void setSource(String source) {
        this.source = source;
    }

    protected String displayTravelInfo() {
        String source = "Source: " + this.source;
        String destination = "Destination: " + this.destination;
        String time = "Flight Time: " + this.time + ":00";
        String output = source + "\n" + destination + "\n" + time;
        return output;
    }
}
