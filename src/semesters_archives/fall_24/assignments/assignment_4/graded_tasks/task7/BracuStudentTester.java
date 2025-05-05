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

package semesters_archives.fall_24.assignments.assignment_4.graded_tasks.task7;

public class BracuStudentTester {
    public static void main(String[] args) {
        BracuStudent st1 = new BracuStudent("Afif", "Mirpur");
        System.out.println("1===============");
        BracuStudent st2 = new BracuStudent("Shanto", "Motijheel");
        BracuStudent st3 = new BracuStudent("Taskin", "Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("2===============");
        st3.showDetails();
        System.out.println("3===============");
        BracuBus bus1 = new BracuBus("Mirpur");
        BracuBus bus2 = new BracuBus("Azimpur", 5);
        bus1.showDetails();
        bus2.showDetails();
        System.out.println("4===============");
        st2.getPass();
        st3.getPass();
        System.out.println("5===============");
        st2.showDetails();
        st3.showDetails();
        System.out.println("6===============");
        bus1.board();
        System.out.println("7===============");
        bus1.board(st1, st2);
        System.out.println("8===============");
        st1.getPass();
        st2.updateHome("Mirpur");
        st1.showDetails();
        st2.showDetails();
        System.out.println("9===============");
        bus1.board(st1);
        bus1.board(st2, st3);
        System.out.println("10===============");
        bus1.showDetails();

    }
}