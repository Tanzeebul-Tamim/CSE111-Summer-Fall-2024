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
