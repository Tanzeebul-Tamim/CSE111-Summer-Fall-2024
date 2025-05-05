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

package semesters_archives.fall_24.assignments.assignment_4.ungraded_tasks.task2;

public class TeamTester {
    public static void main(String[] args) {
        Team b = new Team();
        b.updateName("Bangladesh");
        Player mashrafi = new Player("Mashrafi", 42, 100);
        b.addPlayer(mashrafi);
        Player tamim = new Player("Tamim", 35, 70);
        b.addPlayer(tamim);
        b.printDetail();
        System.out.println("==============");
        Team a = new Team("Australia");
        Player ponting = new Player("Ponting", 50, 300);
        a.addPlayer(ponting);
        Player lee = new Player("Lee", 49, 200);
        a.addPlayer(lee);
        a.printDetail();
    }
}