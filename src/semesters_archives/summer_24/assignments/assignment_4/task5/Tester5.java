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

package semesters_archives.summer_24.assignments.assignment_4.task5;

public class Tester5 {
    public static void main(String[] args) {
        Tournament asiaCup = new Tournament();
        System.out.println(asiaCup.name + " " +
                asiaCup.sportsType + " " + asiaCup.numberOfTeams + " " + asiaCup.teams);
        System.out.println("**************");
        asiaCup.name = "Asia Cup";
        asiaCup.sportsType = "Cricket";
        asiaCup.numberOfTeams = 4;
        asiaCup.teams = new String[] { "BD", "IND", "PAK", "SL" };
        System.out.printf("%s %s Tournament is played between %d teams\n", asiaCup.name, asiaCup.sportsType,
                asiaCup.numberOfTeams);
        System.out.println("The teams are:");
        for (int i = 0; i < asiaCup.teams.length; i++) {
            System.out.println(asiaCup.teams[i]);
        }
    }
}
