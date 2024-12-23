package semesters_archives.fall_24.class_notes.class_14.animal;

// Tester class to demonstrate the behavior of Animal, Cat, and Dog
public class AnimalTester {
    public static void main(String[] args) {
        
        // Creating an instance of the Animal class
        Animal a = new Animal();
        System.out.println("===========");
        
        // Creating an instance of the Cat class
        Cat cat = new Cat();
        System.out.println("===========");
        
        // Creating an instance of the Dog class
        Dog dog = new Dog();
        System.out.println("===========");
        
        // Calling the call method of the Animal class
        a.call();
        System.out.println("===========");
        
        // Calling the overridden call method of the Cat class
        cat.call();
        System.out.println("===========");
        
        // Calling the overridden call method of the Dog class
        dog.call();
        System.out.println("===========");
    }
}