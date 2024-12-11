package semesters_archives.fall_24.class_notes.class_12.student;

// Class to represent a student
public class Student {
    public int ID; // Unique ID assigned to the student
    public String name; // Name of the student
    public static int totalCount; // Static variable to track the total number of students

    // Method to register the student and assign a unique ID
    public void register() {
        this.ID = ++Student.totalCount; // Increment the count & assign the current total count as the ID
    }
}
