package semesters_archives.fall_24.class_notes.class_15;

// Tester class to demonstrate the concept of inheritance
public class InheritanceTester {
    public static void main(String[] args) {
        // Creating a Parent object and demonstrating its methods and toString
        Parent object0 = new Parent();
        System.out.println("===========");

        // Creating a Child1 object and demonstrating its methods and toString
        Child1 object1 = new Child1();
        System.out.println("===========");

        // Creating a Child2 object and demonstrating its methods and toString
        Child2 object2 = new Child2();
        System.out.println("===========");

        // Calling method and toString for Parent object
        object0.method();
        System.out.println(object0.toString());
        System.out.println("===========");

        // Calling method and toString for Child1 object
        object1.method();
        System.out.println(object1);
        System.out.println("===========");

        // Calling method and toString for Child2 object
        object2.method();
        System.out.println(object2);
        System.out.println("===========");
    }
}
