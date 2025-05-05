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

package semesters_archives.fall_24.class_notes.class_7.oop.task6;

public class Test10 {
    public static void main(String[] args) {
        Contact c1 = new Contact();
        c1.number = "+880-1111";
        c1.callHistory = new String[3];
        c1.smsHistory = new String[2];
        Contact c2 = new Contact();
        c2.number = "+880-2222";
        c2.callHistory = new String[2];
        c2.smsHistory = new String[3];
        c1.sendSms(c2, "Good morning");
        c2.call(c1);
        System.out.println("-- -- -- -- --");
        c2.sendSms(c1, "Call when you're free");
        c1.call(c2);
        System.out.println("-- -- -- -- --");
        c1.showHistory();
        System.out.println("-- -- -- -- --");
        c2.showHistory();
        System.out.println("-- -- -- -- --");
        c2.sendSms(c1, "Hello!");
        c1.call(c2);
        System.out.println("-- -- -- -- --");
        c1.showHistory();
        System.out.println("-- -- -- -- --");
        c2.showHistory();
        c1.sendSms(c1, "Are you free?");
        c2.call(c2);
        System.out.println("-- -- -- -- --");
    }
}
