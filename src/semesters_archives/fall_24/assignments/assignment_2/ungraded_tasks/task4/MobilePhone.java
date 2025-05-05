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

package semesters_archives.fall_24.assignments.assignment_2.ungraded_tasks.task4;

public class MobilePhone {
    private int capacity;
    private int contactCount;
    private Contact[] contactList;

    private class Contact {
        private String name;
        private String contactNo;

        private Contact(String name, String contactNo) {
            this.name = name;
            this.contactNo = contactNo;
        }
    }

    public void setContactCapacity(int capacity) {
        this.capacity = capacity;
        this.contactList = new Contact[capacity];
    }

    public void details() {
        System.out.printf("Total Contacts: %d\n", this.contactCount);
        System.out.printf("Contact List:\n");

        if (contactCount > 0) {
            for (Contact contact : contactList) {
                if (contact != null)
                    System.out.printf("%s:%s\n", contact.name, contact.contactNo);
            }
        }
    }

    public void addContact(String name, int contactNo) {
        if (this.contactCount == this.capacity) {
            System.out.println("Storage Full!!");
        } else {
            Contact contact = new Contact(name, contactNo + "");
            this.contactList[this.contactCount++] = contact;

            System.out.printf("The contact of %s is added.\n", name);
        }
    }

    public void makeCall(int contactNo) {
        boolean found = false;

        for (Contact contact : contactList) {
            if (contact != null && contact.contactNo.equals(contactNo + "")) {
                System.out.printf("Calling %s . . .\n", contact.name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.printf("Calling %d . . .\n", contactNo);
        }
    }
}
