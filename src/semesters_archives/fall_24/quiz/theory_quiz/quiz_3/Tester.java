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

package semesters_archives.fall_24.quiz.theory_quiz.quiz_3;

/*
    Question:

    Design and implement a Java application to manage personal information and addresses. The application should handle the following requirements:

    The `Address` Class stores and displays the details of an address, including area, city, and zpi code - all 3 are `private` attributes. The class also allows updating address details under certain constraints.

    The `Person` class stores and displays a person't name and their permanent and present addresses.

    Carefully observe the following driver code and expected output to design the two classes.

    Note: You do not need to write additional getter() & setter() methods.

    Output:
    House:3, Banani, Dhaka-1212
    1 ----------------
    New Person created.
    Name: Mohammad Ali
    Present Address:
    House:3, Banani, Dhaka-1212
    Permanent Address:
    34, Kaptai Road, Chattogram-4347
    2 ----------------
    Updating zipcode requires a city name.
    34, Kaptai Road, Chattogram-4347
    3 ----------------
    Name: Mohammad Ali
    Present Address:
    House:3, Banani, Dhaka-1212
    Permanent Address:
    Shahid Saifuddin Khaled Rd, Chattogram-4000
    4 ----------------
    Mohammad Ali lives in Dhaka
    Mohammad Ali is from Chattogram
    5 ----------------
    Updated Area.
    House:7, Banani, Dhaka-1212
    6 ----------------
 */

public class Tester {
    public static void main(String[] args) {
        Address b1 = new Address("House:3, Banani", "Dhaka", 1212);
        b1.showAddress();
        System.out.println("1 ----------------");
        Address ctg = new Address("34, Kaptai Road", "Chattogram", 4347);
        Person person1 = new Person("Mohammad Ali", ctg, b1);
        person1.displayInfo();
        System.out.println("2 ----------------");
        ctg.setAddress("Shahid Saifuddin Khaled Rd", 4000);
        person1.permanentAddress.showAddress();
        System.out.println("3 ----------------");
        ctg.setAddress("Shahid Saifuddin Khaled Rd", "Chattogram", 4000);
        person1.displayInfo();
        System.out.println("4 ----------------");
        String city = person1.presentAddress.getCity();
        System.out.println(person1.fullName + " lives in " + city);
        String city2 = person1.permanentAddress.getCity();
        System.out.println(person1.fullName + " is from " + city2);
        System.out.println("5 ----------------");
        person1.presentAddress.setAddress("House:7, Banani", 1212);
        b1.showAddress();
        System.out.println("6 ----------------");
    }
}
