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

package semesters_archives.fall_24.term_exams.mid_term_exam.oop;

/*
    Design a class called Boxer With appropriate attributes and features so that the driver code below generates the expected output.
    [NOTE: winLossRatio( ) should calculate the ratio of fights won to fights lost, based on the total number of fights attempted.]

    Output:

    Jake can fight 3 opponents.
    ==========1==========
    Name: Jake, Weight: 102.95 KG
    No fights yet.
    ==========2==========
    ==========3==========
    Name: Jake, Weight: 102.95 KG
    Fight history:
    vs Deji: Won
    ==========4==========
    Career Stats: 1:1
    ==========5==========
    Name: Jake, Weight: 102.95 KG
    Fight history:
    vs Deji: Won
    vs Tommy: Lost
    vs Felix: Lost
    ==========6==========
    Cannot fight more than 3 opponent(s)
    ==========7==========
    Name: Jake, Weight: 102.95 KG
    Fight history:
    vs Deji: Won
    vs Tommy: Lost
    vs Felix: Lost
    ==========8==========
    Career Stats: 1:2
*/

public class BoxerTester {
    public static void main(String[] args) {
        Boxer jake = new Boxer();
        jake.updateDetails("Jake", 102.95, 3);
        System.out.println("==========1==========");
        jake.showDetails();
        System.out.println("==========2==========");
        jake.fight("Deji", true);
        System.out.println("==========3==========");
        jake.showDetails();
        jake.fight("Tommy", false);
        System.out.println("==========4==========");
        System.out.println(jake.winLossRatio());
        System.out.println("==========5==========");
        jake.fight("Felix");
        jake.showDetails();
        System.out.println("==========6==========");
        jake.fight("Mike", true);
        System.out.println("==========7==========");
        jake.showDetails();
        System.out.println("==========8==========");
        System.out.println(jake.winLossRatio());
    }
}
