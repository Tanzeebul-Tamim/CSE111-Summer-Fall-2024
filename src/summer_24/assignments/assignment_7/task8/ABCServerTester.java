package summer_24.assignments.assignment_7.task8;

public class ABCServerTester {
    public static void main(String args[]) {
        ABCServer server1 = new ABCServer();
        server1.details();
        System.out.println("---------------");
        ABCServer server2 = new ABCServer("Heroes Reborn", 6);
        server2.details();
        System.out.println("---------------");
        server2.addMembers("Edward");
        server2.addMembers("William");
        System.out.println("----------------");
        server2.details();
        System.out.println("----------------");
        server2.addMembers("John", "Hero's Mentor");
        server2.addMembers("Albert",
                "Thunderstrike");
        server2.addMembers("Max", "Radiant Avenger");
        System.out.println("----------------");
        server2.details();
        System.out.println("----------------");
        server2.addMembers("Daniel");
        server2.addMembers("Donal", "Valor Knight");
        System.out.println("----------------");
        server2.details();
    }
}
