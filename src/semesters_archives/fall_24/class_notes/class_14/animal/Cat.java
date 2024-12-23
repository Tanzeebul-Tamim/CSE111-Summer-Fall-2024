package semesters_archives.fall_24.class_notes.class_14.animal;

// Derived class representing a Cat, inheriting from Animal
public class Cat extends Animal {

    // Default constructor for Cat
    Cat() {
        System.out.println("A Cat has appeared!"); // Print message when a Cat object is created
    }

    // Overridden method for simulating a Cat's call
    @Override
    void call() {
        System.out.println("The Cat says: Meow."); // Print message with the Cat's call
    }
}