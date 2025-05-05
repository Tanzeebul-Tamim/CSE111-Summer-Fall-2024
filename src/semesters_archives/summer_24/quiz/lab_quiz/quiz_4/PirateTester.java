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

package semesters_archives.summer_24.quiz.lab_quiz.quiz_4;

/*
    Design the Pirate class such that the `main` method produces the following output

    1===================
    empty
    2===================
    Add name to show poster
    3===================
    4===================
    Monkey D. Luffy's Poster:
    Pirate's Bounty: 300M berries
    Pirate's level: Super Rookie
    5===================
    6===================
    Blackbeard's Poster:
    Pirate's Bounty: 3700M berries
    Pirate's level: Emperor
    7===================
    Blackbeard's bounty raised by 200M berries
    3900
    8===================
    Monkey D. Luffy's bounty raised by 3000M berries
    3300
    9===================
 */

public class PirateTester {
    public static void main(String[] args) {
        Pirate p1 = new Pirate();
        System.out.println("1===================");
        System.out.println(p1.name);
        System.out.println("2===================");
        p1.showPoster();
        System.out.println("3===================");
        p1.name = "Monkey D. Luffy";
        p1.bounty = 300;
        p1.level = "Super Rookie";
        System.out.println("4===================");
        p1.showPoster();
        System.out.println("5===================");
        Pirate p2 = new Pirate();
        p2.name = "Blackbeard";
        p2.bounty = 3700;
        p2.level = "Emperor";
        System.out.println("6===================");
        p2.showPoster();
        System.out.println("7===================");
        p2.awakePower("haki");
        System.out.println(p2.bounty);
        System.out.println("8===================");
        p1.awakePower("dream");
        System.out.println(p1.bounty);
        System.out.println("9===================");
    }
}
