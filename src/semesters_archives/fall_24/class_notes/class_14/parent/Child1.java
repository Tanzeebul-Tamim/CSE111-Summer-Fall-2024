package semesters_archives.fall_24.class_notes.class_14.parent;

// Child1 class inheriting from Parent
public class Child1 extends Parent {

    // Default constructor for Child1
    Child1() {
        System.out.println("Child1 object has been created."); // Print message when a Child1 object is created
    }

    // Overridden instance method for Child1
    @Override
    void methodA() {
        System.out.println("Child1 instance method called."); // Print message indicating the Child1 instance method is invoked
    }
}
