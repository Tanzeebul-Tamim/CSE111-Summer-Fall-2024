package semesters_archives.fall_24.class_notes.class_14.animal;

// Derived class representing a Dog, inheriting from Animal
public class Dog extends Animal {

    // Default constructor for Dog
    Dog() {
        System.out.println("A Dog has joined the scene!"); // Print message when a Dog object is created
    }

    // Overridden method for simulating a Dog's call
    @Override
    void call() {
        System.out.println("The Dog says: Woof."); // Print message with the Dog's call
    }
}
