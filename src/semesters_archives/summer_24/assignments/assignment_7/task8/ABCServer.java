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

public class ABCServer {
    private String name;
    private int capacity;
    private int memberCount;
    private String[][] members;

    public ABCServer() {
        this("Default", 10);
    }

    public ABCServer(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.members = new String[this.capacity][2];
    }

    public void details() {
        System.out.printf("Server Name: %s\n", this.name);
        System.out.printf("Member Capacity: %d\n", this.capacity);
        System.out.printf("Total Members: %d\n", this.memberCount);
        System.out.println("Members:");

        for (String[] member : this.members) {
            String name = member[0];
            String role = member[1];

            if (name != null && member != null) {
                System.out.printf("Name:Role --> %s:%s\n", name, role);
            }
        }
    }

    public void addMembers(String name) {
        addMembers(name, "Rising Hero");
    }

    public void addMembers(String name, String role) {
        if (this.memberCount == this.capacity) {
            System.out.println("Sorry, maximum capacity exceeded!");
        } else {
            this.members[this.memberCount][0] = name;
            this.members[this.memberCount++][1] = role;

            System.out.printf("%s is added.\n", role);
        }
    }
}
