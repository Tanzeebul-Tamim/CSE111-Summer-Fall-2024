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

package semesters_archives.fall_24.class_notes.class_7.oop.task7;

public class ClubTester {
    public static void main(String[] args) {
        Club club1 = new Club();
        System.out.println("1=================");
        System.out.println(club1.approveClub("Makers Club", 4, 10000));
        System.out.println("2=================");
        System.out.println(club1.approveClub("Makers Club", 10, 10000));
        System.out.println("3=================");
        club1.info();
        System.out.println("4=================");
        club1.createEvent("Exhibit", 4099, 5);
        System.out.println("5=================");
        club1.createEvent("Impromptu", 5700, 6);
        System.out.println("6=================");
        club1.recruitMember(5);
        System.out.println("7=================");
        club1.createEvent("Impromptu", 5700, 6);
        System.out.println("8=================");
        club1.info();
        System.out.println("9=================");
        club1.createEvent("Potluck", 1200, 3);
        System.out.println("10=================");
        club1.createEvent("Potluck", 100, 3);
        System.out.println("11=================");
        club1.info();
        System.out.println("12=================");
        club1.createEvent("Speech", 100, 2);
        System.out.println("13=================");
        club1.endEvent("Exhibit");
        System.out.println("14=================");
        club1.info();
        System.out.println("15=================");
        club1.createEvent("Speech", 100, 2);
    }
}
