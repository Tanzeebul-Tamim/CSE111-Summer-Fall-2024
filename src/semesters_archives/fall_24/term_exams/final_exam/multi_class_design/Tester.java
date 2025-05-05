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

/*
    Question:

    Design the Event and Organizer classes in such a way that the following code provides the expected output. Hint:
        ● Make the name instance variable of the Event class private.
        ● For simplicity assume that the Event class can create maximum 5 event objects and an Organizer can organize maximum 4 events.

    Expected Output:

    Total Events: 0
    Event Details:
    1---------------
    Name: HP Day
    Date: 7/12/24
    2---------------
    Please provide the organizer's name
    3---------------
    Total Events: 2
    Event Details:
    Event 1:
    Name: HP Day
    Date: 7/12/24
    Event 2:
    Name: TechConnect
    Date: 10/12/24
    4---------------
    BRACU successfully organized HP Day
    BRACU successfully organized TechConnect
    5---------------
    6---------------
    BUET successfully organized NSysS 2024
    BRACU successfully organized From Earth to Orbit
    7---------------
    No event is scheduled for 21/12/24
    8---------------
    From Earth to Orbit
    9---------------
    Total Events: 4
    Event Details:
    Event 1:
    Name: HP Day
    Date: 7/12/24
    Event 2:
    Name: TechConnect
    Date: 10/12/24
    Event 3:
    Name: From Earth to Orbit
    Date: 15/12/24
    Event 4:
    Name: NSysS 2024
    Date: 21/12/24
 */

@SuppressWarnings("unused")
public class Tester {
    public static void main(String args[]) {
        Event.allEventInfo();
        System.out.println("1---------------");
        Event ev1 = new Event("HP Day", "7/12/24");
        Event ev2 = new Event("TechConnect", "10/12/24");
        System.out.println(ev1.details());
        System.out.println("2---------------");
        Organizer uni = new Organizer();
        Organizer bracu = new Organizer("BRACU");
        Organizer buet = new Organizer("BUET");
        System.out.println("3---------------");
        Event.allEventInfo();
        System.out.println("4---------------");
        bracu.organizeEvent(ev1);
        bracu.organizeEvent(ev2);
        System.out.println("5---------------");
        Event ev3 = new Event("From Earth to Orbit", "15/12/24");
        Event ev4 = new Event("NSysS 2024", "21/12/24");
        System.out.println("6---------------");
        buet.organizeEvent(ev4);
        bracu.organizeEvent(ev3);
        System.out.println("7---------------");
        bracu.searchEventByDate("21/12/24");
        System.out.println("8---------------");
        bracu.searchEventByDate("15/12/24");
        System.out.println("9---------------");
        Event.allEventInfo();
    }
}
