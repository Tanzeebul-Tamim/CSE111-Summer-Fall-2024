/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
