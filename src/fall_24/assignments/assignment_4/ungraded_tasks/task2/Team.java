package fall_24.assignments.assignment_4.ungraded_tasks.task2;

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
            this.players[this.playerCount] = player;
            this.playerCount++;
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
