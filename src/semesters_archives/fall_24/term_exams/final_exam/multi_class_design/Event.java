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

package semesters_archives.fall_24.term_exams.final_exam.multi_class_design;

public class Event {
    private static int eventCount;
    private static Event[] events;

    static {
        events = new Event[5];
    }

    private int id;
    private String name;
    public String date;

    public Event(String name, String date) {
        this.id = eventCount + 1;
        this.name = name;
        this.date = date;
        events[eventCount++] = this;
    }

    public String details() {
        return "Name: " + this.name + "\nDate: " + this.date;
    }

    public String getName() {
        return this.name;
    }

    public static void allEventInfo() {
        System.out.printf("Total Events: %d\nEvent Details:\n", eventCount);

        for (Event event : events) {
            if (event != null) {
                System.out.printf("Event %d:\n", event.id);
                System.out.println(event.details());
            }
        }
    }
}
