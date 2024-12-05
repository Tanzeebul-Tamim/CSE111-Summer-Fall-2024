package fall_24.assignments.assignment_4.ungraded_tasks.task2;

public class TeamTester {
    public static void main(String[] args) {
        Team b = new Team();
        b.updateName("Bangladesh");
        Player mashrafi = new Player("Mashrafi", 42, 100);
        b.addPlayer(mashrafi);
        Player tamim = new Player("Tamim", 35, 70);
        b.addPlayer(tamim);
        b.printDetail();
        System.out.println("==============");
        Team a = new Team("Australia");
        Player ponting = new Player("Ponting", 50, 300);
        a.addPlayer(ponting);
        Player lee = new Player("Lee", 49, 200);
        a.addPlayer(lee);
        a.printDetail();
    }
}