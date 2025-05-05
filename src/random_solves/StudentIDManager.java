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

package random_solves;

/*
You are provided with an array of student IDs representing the IDs of students in a school.

When a student leaves, the subsequent students in the array need to shift one position to the left to fill the gap. The last position in the array will be filled with a 0 to indicate an empty slot.

Write a method within the StudentIDManager class that performs this operation. The method should take an array of student IDs and the ID of the student who left, and then update the array accordingly. The array should maintain its original order except for the shifts caused by the removal.

Additionally, if the ID to be removed is not present in the array, the method should print a message indicating that the ID is not found.

Define the class StudentIDManager and the method signature for this task. The method should update the original array to reflect the changes.

Class Example:

public class StudentIDManager {
    // Method to implement
}

Method Signature:

public void removeStudentID(int[] studentIDs, int idToRemove);
*/

public class StudentIDManager {
    // Method to iterate over studentID array
    static void printIDs(int[] studentIDs) {
        for (int i = 0; i < studentIDs.length; i++) {
            int ID = studentIDs[i];

            if (i == studentIDs.length - 1) {
                System.out.print(ID);
                System.out.println();
            } else {
                System.out.print(ID + ", ");
            }
        }
    }

    // Using needsChange flag
    static void removeStudentIDUsingFlag(int[] studentIDs, int[] IDsToRemove) {
        for (int idToRemove : IDsToRemove) {
            boolean found = false;
            for (int studentID : studentIDs) {
                if (studentID == idToRemove) {
                    found = true;
                    continue;
                }

                if (found && studentID == idToRemove) {
                    throw new Error("Duplicate IDs not allowed!");
                }
            }

            if (!found) {
                throw new Error(String.format("ID: %d not found", idToRemove));
            }

            boolean needsChange = false;
            for (int i = 0; i < studentIDs.length; i++) {
                if (i == studentIDs.length - 1) {
                    studentIDs[i] = 0;
                    continue;
                }

                if (studentIDs[i] == idToRemove || needsChange) {
                    studentIDs[i] = studentIDs[i + 1];
                    needsChange = true;
                }
            }
        }
    }

    // Without using flag
    static void removeStudentID(int[] studentIDs, int[] IDsToRemove) {
        for (int idToRemove : IDsToRemove) {
            boolean found = false;
            for (int studentID : studentIDs) {
                if (studentID == idToRemove) {
                    found = true;
                    break;
                }

                if (found && studentID == idToRemove) {
                    throw new Error("Duplicate IDs not allowed!");
                }
            }

            if (!found) {
                throw new Error(String.format("ID: %d not found", idToRemove));
            }

            for (int i = 0; i < studentIDs.length; i++) {
                if (i == studentIDs.length - 1) {
                    studentIDs[i] = 0;
                    break;
                }

                if (studentIDs[i] == idToRemove) {
                    studentIDs[i] = studentIDs[i + 1];
                    studentIDs[i + 1] = idToRemove;
                }
            }
        }
    }

    public static void main(String[] args) {
        int studentIDs[] = { 34, 65, 56, 12, 23, 45, 67 };
        int idsToRemove1[] = { 65, 12 };
        int idsToRemove2[] = { 34, 67 };

        System.out.println("Array before students left.");
        printIDs(studentIDs);

        removeStudentIDUsingFlag(studentIDs, idsToRemove1);
        System.out.println();

        System.out.println("Array after some students left.");
        printIDs(studentIDs);

        removeStudentID(studentIDs, idsToRemove2);
        System.out.println();

        System.out.println("Array after some students left again.");
        printIDs(studentIDs);
    }
}
