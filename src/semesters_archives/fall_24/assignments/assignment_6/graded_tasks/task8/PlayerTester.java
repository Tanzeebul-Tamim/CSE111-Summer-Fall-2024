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

package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task8;

public class PlayerTester {
    public static void main(String[] args) {
        System.out.println("Total number of players: " + Player.total);
        System.out.println("1------------------");
        Player p1 = new Player("Neymar", "Brazil", 5);
        System.out.println(p1.player_detail());
        System.out.println("===================");
        Player.info();
        System.out.println("2------------------");
        Player p2 = new Player("Ronaldo", "Portugal", 7);
        System.out.println(p2.player_detail());
        System.out.println("===================");
        Player.info();
        System.out.println("3------------------");
        Player p3 = new Player("Messi", "Argentina", 6);
        System.out.println(p3.player_detail());
        System.out.println("===================");
        Player.info();
        System.out.println("4------------------");
        Player p4 = new Player("Mbappe", "France", 10);
        System.out.println(p4.player_detail());
        System.out.println("===================");
        Player.info();
    }
}
