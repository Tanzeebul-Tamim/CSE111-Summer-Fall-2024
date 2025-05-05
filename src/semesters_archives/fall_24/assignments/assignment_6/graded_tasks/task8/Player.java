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

public class Player {
    protected static int total;
    private static int max_players;
    private static Player[] players;

    static {
        Player.max_players = 11;
        Player.players = new Player[Player.max_players];
    }

    private String name;
    private String country;
    private int jerseyNo;

    protected Player(String name, String country, int jerseyNo) {
        this.name = name;
        this.country = country;
        this.jerseyNo = jerseyNo;
        Player.players[total++] = this;
    }

    protected static void info() {
        System.out.format("Total number of players: %d\n", total);
        System.out.format("Players enlisted so far: ");

        int i = 0;
        for (Player player : players) {
            if (player != null) {
                System.out.print(player.name);
                i++;

                if (i == total) {
                    System.out.println();
                } else {
                    System.out.print(", ");
                }
            }
        }
    }

    protected String player_detail() {
        String name = "Player Name: " + this.name;
        String jerseyNo = "Jersey Number: " + this.jerseyNo;
        String country = "Country: " + this.country;
        String output = name + "\n" + jerseyNo + "\n" + country;
        return output;
    }

}
