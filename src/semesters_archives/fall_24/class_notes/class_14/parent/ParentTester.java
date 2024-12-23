package semesters_archives.fall_24.class_notes.class_14.parent;

// Tester class to demonstrate behavior of Parent and Child classes
public class ParentTester {
    public static void main(String[] args) {

        // Creating an instance of the Parent class
        Parent object0 = new Parent();
        System.out.println("===========");

        // Creating an instance of the Child1 class
        Child1 object1 = new Child1();
        System.out.println("===========");

        // Creating an instance of the Child2 class
        Child2 object2 = new Child2();
        System.out.println("===========");

        // Calling the instance method of the Parent class
        object0.methodA();
        System.out.println("===========");

        // Calling the overridden instance method of the Child1 class
        object1.methodA();
        System.out.println("===========");

        // Calling the overridden instance method of the Child2 class
        object2.methodA();
        System.out.println("===========");
    }
}
