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

public class Team {
    private String name;
    private Player[] players;
    private int playerCount;

    public Team(String name) {
        this.name = name;
        this.players = new Player[2];
    }

    public Team() {
        this(null);
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        if (this.playerCount >= this.players.length) {
            System.out.println("No more capacity.");
        } else {
            this.players[this.playerCount++] = player;
        }
    }

    public void printDetail() {
        System.out.printf("Team: %s\n", this.name);
        System.out.println("List of players:");

        for (Player player : this.players) {
            System.out.printf("Name: %s\n", player.name);
            System.out.printf("Age: %d, Total Matches: %d\n", player.age, player.matches);
        }
    }
}
