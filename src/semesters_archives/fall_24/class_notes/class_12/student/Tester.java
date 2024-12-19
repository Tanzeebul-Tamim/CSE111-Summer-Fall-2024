package semesters_archives.fall_24.class_notes.class_12.student;

// Class to test the Student class
public class Tester {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Student s1 = new Student(); // Create the first student instance
        s1.name = "Asif"; // Assign the name "Asif" to the first student
        s1.register(); // Register the first student, assigning a unique ID
        System.out.println(s1.totalCount); // Display the total student count

        Student s2 = new Student(); // Create the second student instance
        s2.name = "Arif"; // Assign the name "Arif" to the second student
        s2.register(); // Register the second student, assigning a unique ID
        
        // Notice that the total student count is same for both Student instance
        System.out.println(s1.totalCount); // Display the total student count from the first student's perspective
        System.out.println(s2.totalCount); // Display the total student count from the second student's perspective
    }
}
