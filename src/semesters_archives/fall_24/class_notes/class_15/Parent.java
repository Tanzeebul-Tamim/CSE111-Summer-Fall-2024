package semesters_archives.fall_24.class_notes.class_15;

// Parent class for Child1 and Child2, with common behavior
public class Parent {
    int a = 5; // Instance variable 'a' common to Parent

    // Constructor to initialize a Parent object
    Parent() {
        System.out.println("Creating Parent Object"); // Confirm creation of Parent object
    }

    // Method that prints a message and the value of 'a' from Parent
    public void method() {
        System.out.println("Parent method call"); // Indicate method call
        System.out.println("a = " + this.a); // Print value of 'a' from Parent
    }

    // Override the toString method to describe the Parent class object
    public String toString() {
        return super.toString() + "\nThis is Parent Object"; // Append Parent specific info
    }
}
