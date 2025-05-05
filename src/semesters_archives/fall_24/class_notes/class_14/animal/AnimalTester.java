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