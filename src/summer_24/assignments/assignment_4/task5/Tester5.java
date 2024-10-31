package summer_24.assignments.assignment_4.task5;

public class Tester5 {
    public static void main(String[] args) {
        Tournament asiaCup = new Tournament();
        System.out.println(asiaCup.name + " " +
                asiaCup.sportsType + " " + asiaCup.numberOfTeams + " " + asiaCup.teams);
        System.out.println("**************");
        asiaCup.name = "Asia Cup";
        asiaCup.sportsType = "Cricket";
        asiaCup.numberOfTeams = 4;
        asiaCup.teams = new String[] { "BD", "IND", "PAK", "SL" };
        System.out.printf("%s %s Tournament is played between %d teams\n", asiaCup.name, asiaCup.sportsType,
                asiaCup.numberOfTeams);
        System.out.println("The teams are:");
        for (int i = 0; i < asiaCup.teams.length; i++) {
            System.out.println(asiaCup.teams[i]);
        }
    }
}
