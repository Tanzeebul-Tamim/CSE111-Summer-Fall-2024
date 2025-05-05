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

package semesters_archives.fall_24.assignments.assignment_8.task1;

public class VaccineTester {
    public static void main(String[] args) {
        Vaccine astra = new Vaccine("AstraZeneca", "UK", 60);
        Vaccine modr = new Vaccine("Moderna", "UK", 30);
        Vaccine sin = new Vaccine("Sinopharm", "China", 30);

        Person p1 = new Person("Bob", 21, "Student");
        System.out.println("=================");
        p1.pushVaccine(astra);
        System.out.println("=================");
        p1.showDetail();
        System.out.println("=================");
        p1.pushVaccine(sin, "2nd Dose");
        System.out.println("=================");
        p1.pushVaccine(astra, "2nd Dose");
        System.out.println("=================");
        p1.showDetail();
        System.out.println("=================");
        p1.pushVaccine(astra, "2nd Dose");
        System.out.println("=================");
        p1.showDetail();
        System.out.println("=================");

        Person p2 = new Person("Carol", 23, "Actor");
        System.out.println("=================");
        p2.pushVaccine(sin);
        System.out.println("=================");

        Person p3 = new Person("David", 34);
        System.out.println("=================");
        p3.pushVaccine(modr, "2nd Dose");
        System.out.println("=================");
        p3.pushVaccine(modr, "1st Dose");
        System.out.println("=================");
        p3.showDetail();
        System.out.println("=================");
        p3.pushVaccine(modr, "2nd Dose");

    }
}
