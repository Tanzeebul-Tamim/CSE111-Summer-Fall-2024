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

package semesters_archives.summer_24.assignments.assignment_5.task5;

public class StrangerMagic {
    public static void main(String[] args) {
        MagicItem char1 = new MagicItem();
        MagicItem char2 = new MagicItem();

        char1.newCharacter("Eleven");
        char2.newCharacter("Mike Wheeler");

        System.out.println("1 ==========");
        char1.displayInfo();
        System.out.println("2 ==========");
        char2.displayInfo();
        System.out.println("3 ==========");
        char1.findItem("Potion");
        char1.findItem("Elixir");
        char1.findItem("Elixir");
        char2.findItem("Potion");
        System.out.println("4 ==========");
        char1.findItem("Amulet");
        System.out.println("5 ==========");
        char1.displayInfo();
        System.out.println("6 ==========");
        char1.useItem("Potion");
        char1.useItem("Elixir");
        System.out.println("7 ==========");
        char1.displayInfo();
        System.out.println("8 ==========");
        char1.findItem("Amulet");
        System.out.println("9 ==========");
        char1.displayInfo();
        System.out.println("10 ==========");
        char2.useItem("Amulet");
        System.out.println("11 ==========");
        char2.displayInfo();
    }
}
