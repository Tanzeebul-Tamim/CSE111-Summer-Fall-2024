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

package semesters_archives.summer_24.assignments.assignment_4.task9;

public class CellPhone {
    public String model = "unknown";
    public String[] contacts = new String[3];
    private int contactCount;

    private boolean validateData(String contact) {
        boolean hyphenFound = false;
        int hyphenIndex = -1;
        String contactNo = "";

        for (int i = 0; i < contact.length(); i++) {
            char character = contact.charAt(i);

            if (character == '-' && contact.charAt(i - 1) == ' ' && contact.charAt(i + 1) == ' ') {
                hyphenFound = true;
                hyphenIndex = i;
            }

            if (hyphenFound && i > hyphenIndex + 1) {
                contactNo += contact.charAt(i);
            }
        }

        if (hyphenFound) {
            char getZero = contactNo.charAt(0);
            char getOne = contactNo.charAt(1);

            if (getZero != '0' || getOne != '1') {
                System.out.println("Invalid contact no!\nCorrect contact no format is \"01***\"");
                return false;
            }

            if (contactNo.length() != 5) {
                System.out.println("Invalid contact no!\nMust contain 5 digits.");
                return false;
            }

            for (int i = 0; i < contactNo.length(); i++) {
                char character = contactNo.charAt(i);

                int ascii = (int) character;

                if (ascii < 48 || ascii > 57) {
                    System.out.println("Invalid character in contact no!\nMust contain digits only");
                    return false;
                }
            }
        } else {
            System.out.println("Invalid format!\nCorrect format is \"Name - 01***\"");
            return false;
        }

        return true;
    }

    public void storeContact(String contact) {
        boolean dataValidation = validateData(contact);

        if (dataValidation) {
            if (contactCount < 3) {
                contacts[contactCount++] = contact;

                System.out.println("Contact Stored");
            } else
                System.out.println("Memory full. New contact can't be stored.");
        }
    }

    public void printDetails() {
        System.out.printf("Phone Model %s\n", model);
        System.out.printf("Contacts Stored %d\n", contactCount);

        if (contactCount > 0) {
            System.out.println("Stored Contacts:");
        }

        for (String contact : contacts) {
            if (contact != null) {
                System.out.println(contact);
            }
        }
    }
}
