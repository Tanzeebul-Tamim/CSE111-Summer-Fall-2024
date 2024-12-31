package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task5;

/*
Important Note:

In Java, when you print an object using `System.out.println(object)`, the `toString()` method of the object is implicitly called. If the class overrides the `toString()` method, the overridden version will be used to generate the string representation of the object.

Why does this happen?

Java's `Object` class (the parent class of all classes in Java) has a default `toString()` method. If you don't override it, the default implementation is used, which returns the object's class name followed by its hash code. By overriding the `toString()` method in a class, you customize how objects of that class are represented as strings.

So, in this case, both `RealNumber` and `ComplexNumber` has overridden the `toString()` method to provide the desired output when their objects are printed.
*/

public class ComplexNumberTester {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println(cn1);
        System.out.println("----------------");
        ComplexNumber cn2 = new ComplexNumber(5.0, 7.0);
        System.out.println(cn2);
    }
}
