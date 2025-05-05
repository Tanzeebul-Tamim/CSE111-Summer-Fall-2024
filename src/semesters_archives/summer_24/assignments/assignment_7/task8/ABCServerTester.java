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

package semesters_archives.summer_24.assignments.assignment_7.task8;

public class ABCServerTester {
    public static void main(String args[]) {
        ABCServer server1 = new ABCServer();
        server1.details();
        System.out.println("---------------");
        ABCServer server2 = new ABCServer("Heroes Reborn", 6);
        server2.details();
        System.out.println("---------------");
        server2.addMembers("Edward");
        server2.addMembers("William");
        System.out.println("----------------");
        server2.details();
        System.out.println("----------------");
        server2.addMembers("John", "Hero's Mentor");
        server2.addMembers("Albert",
                "Thunderstrike");
        server2.addMembers("Max", "Radiant Avenger");
        System.out.println("----------------");
        server2.details();
        System.out.println("----------------");
        server2.addMembers("Daniel");
        server2.addMembers("Donal", "Valor Knight");
        System.out.println("----------------");
        server2.details();
    }
}
