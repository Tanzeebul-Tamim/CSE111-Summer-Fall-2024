package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task8;

public class Player {
    protected static int total;
    private static int max_players;
    private static Player[] players;

    private String name;
    private String country;
    private int jerseyNo;

    static {
        Player.max_players = 11;
        Player.players = new Player[Player.max_players];
    }

    public Player(String name, String country, int jerseyNo) {
        this.name = name;
        this.country = country;
        this.jerseyNo = jerseyNo;
        Player.players[total++] = this;
    }

    public static void info() {
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

    public String player_detail() {
        String name = "Player Name: " + this.name;
        String jerseyNo = "Jersey Number: " + this.jerseyNo;
        String country = "Country: " + this.country;
        String output = name + "\n" + jerseyNo + "\n" + country;
        return output;
    }

}
