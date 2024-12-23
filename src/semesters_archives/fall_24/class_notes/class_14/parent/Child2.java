package semesters_archives.fall_24.class_notes.class_14.parent;

// Child2 class inheriting from Parent
public class Child2 extends Parent {

    // Default constructor for Child2
    Child2() {
        System.out.println("Child2 object has been created."); // Print message when a Child2 object is created
    }

    // Overridden instance method for Child2
    @Override
    void methodA() {
        System.out.println("Child2 instance method called."); // Print message indicating the Child2 instance method is invoked
    }
}
