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

package semesters_archives.fall_24.class_notes.class_6;

public class Tester1 {
    public static void main(String[] args) {
        Series s1 = new Series();
        s1.newShow("name1", 2025, "Coming soon");
        Series s2 = new Series();
        s2.newShow("name2", 2010, "Completed");
        Series s3 = new Series();
        s3.newShow("name3", 2013, "Ongoing");
        System.out.println("----------");
        System.out.println(s1.details());
        System.out.println("----------");
        System.out.println(s2.details());
        System.out.println("----------");
        System.out.println(s3.details());
        System.out.println("----------");
        s1.setTags("Action");
        s1.setTags("Drama");
        s1.setTags("Crime");
        s1.setTags("English");
        System.out.println("----------");
        s2.setTags("History");
        String[] tags = { "Drama", "Thriller" };
        s2.setTags(tags);
        System.out.println("----------");
        s3.setTags("Action");
        s3.setTags("Horror");
        String[] tags2 = { "Crime", "Fantasy" };
        s3.setTags(tags2);
        System.out.println("----------");
        System.out.println(s1.details());
        System.out.println("----------");
        System.out.println(s2.details());
        System.out.println("----------");
        System.out.println(s3.details());
        System.out.println("----------");
    }
}
