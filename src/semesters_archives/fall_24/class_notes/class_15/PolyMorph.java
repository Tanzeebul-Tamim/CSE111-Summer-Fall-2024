package semesters_archives.fall_24.class_notes.class_15;

// Demonstrates polymorphism with parent and child classes
public class PolyMorph {
    public static void main(String[] args) {

        // Creating a Parent reference pointing to a Child1 object
        Parent object = new Child1();
        System.out.println("= = = = = = = = = = = = = = = ");
        System.out.println(object.a); // Accessing Parent's variable 'a'
        System.out.println(object); // Calling Parent's toString method
        System.out.println("= = = = = = = = = = = = = = = ");

        // Creating a Child1 object directly
        Child1 c1 = new Child1();
        System.out.println("= = = = = = = = = = = = = = = ");
        System.out.println("c1.a = " + c1.a); // Accessing Child1's variable 'a'
        System.out.println(c1); // Calling Child1's toString method
        System.out.println("= = = = = = = = = = = = = = = ");

        // Demonstrating Parent reference pointing to Child1 object
        Parent p1 = c1;
        System.out.println("p1.a = " + p1.a); // Accessing Parent's variable 'a'
        System.out.println(p1); // Calling Parent's toString method
    }
}
