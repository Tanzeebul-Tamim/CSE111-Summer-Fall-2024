package semesters_archives.fall_24.class_notes.class_15;

// Child1 class that extends the Parent class
public class Child1 extends Parent {
    int a = 10; // Instance variable a specific to Child1

    // Constructor to initialize a Child1 object
    Child1() {
        super(); // Call to Parent class constructor
        System.out.println("Creating Child1 Object"); // Confirm creation of Child1 object
    }

    // Method that prints a message and the value of 'a' from Child1
    public void method() {
        System.out.println("Child1 method call"); // Indicate method call
        System.out.println("a = " + this.a); // Print value of 'a' from Child1
    }

    // Override the toString method to include the Parent class information
    public String toString() {
        return super.toString() + "\nThis is also a Child1 object."; // Append Child1 specific info
    }
}
