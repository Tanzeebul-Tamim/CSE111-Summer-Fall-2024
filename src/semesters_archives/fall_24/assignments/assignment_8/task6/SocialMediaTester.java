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

package semesters_archives.fall_24.assignments.assignment_8.task6;

public class SocialMediaTester {
    public static void main(String[] args) {
        Bondhus f1 = new Bondhus("Sheldon", "sheldon@qmail.com");
        Bondhus f2 = new Bondhus("Penny", "penny@qmail.com");
        Bondhus f3 = new Bondhus("Leonard", "leonard@qmail.com");
        System.out.println("1----------------------------");
        f1.showSentbox();
        System.out.println("2----------------------------");
        f2.showSentbox();
        System.out.println("3----------------------------");
        f2.sendMessage("Hi");
        f2.sendMessage("Hello");
        f2.sendMessage("NiHao");
        f3.sendMessage("Hola");
        f3.sendMessage("Sheldon, please.");
        System.out.println("4----------------------------");
        f2.showSentbox();
        System.out.println("5----------------------------");
        f1.showSentbox();
        System.out.println("6----------------------------");
        f1.sendMessage("Bazinga!");
        f2.sendMessage("Well, duh!");
        f3.showSentbox();
        System.out.println("7----------------------------");
        f2.showSentbox();
        f2.sendMessage("Bye.");
        f2.sendMessage("Oh! No");
        System.out.println("8----------------------------");
        f1.showSentbox();
        System.out.println("9----------------------------");
        System.out.println(f1);
        System.out.println("10----------------------------");
        System.out.println(f2);

    }
}
