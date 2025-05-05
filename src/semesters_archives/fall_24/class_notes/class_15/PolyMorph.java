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
