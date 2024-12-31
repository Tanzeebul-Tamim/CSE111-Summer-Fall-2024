package semesters_archives.fall_24.class_notes.class_15;

// Child2 class that extends the Parent class
public class Child2 extends Parent {
    int a = 7; // Instance variable 'a' specific to Child2

    // Constructor to initialize a Child2 object
    Child2() {
        System.out.println("Creating Child2 Object"); // Confirm creation of Child2 object
    }

    // void method() {
    //     System.out.println("Child2 method call");
    //     System.out.println("a = "+this.a);
    // }

    // Override the toString method to include the Parent class information
    public String toString() {
        return super.toString() + "\nThis is also a Child2 object."; // Append Child2 specific info
    }
}
