package summer_24.assignments.assignment_7.task8;

public class ABCServer {
    private String name;
    private int capacity;
    private int memberCount;
    private String[][] members;

    ABCServer() {
        this.name = "Default";
        this.capacity = 10;
        this.memberCount = 0;
        this.members = new String[this.capacity][2];
    }

    ABCServer(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.memberCount = 0;
        this.members = new String[this.capacity][2];
    }

    void details() {
        System.out.printf("Server Name: %s\n", this.name);
        System.out.printf("Member Capacity: %d\n", this.capacity);
        System.out.printf("Total Members: %d\n", this.memberCount);
        System.out.println("Members:");

        for (String[] member : this.members) {
            String name = member[0];
            String role = member[1];

            if (name != null && member != null) {
                System.out.printf("Name:Role --> %s:%s\n", name, role);
            }
        }
    }

    void addMembers(String name) {
        addMembers(name, "Rising Hero");
    }

    void addMembers(String name, String role) {
        if (this.memberCount == this.capacity) {
            System.out.println("Sorry, maximum capacity exceeded!");
        } else {
            this.members[this.memberCount][0] = name;
            this.members[this.memberCount][1] = role;
            this.memberCount++;

            System.out.printf("%s is added.\n", role);
        }
    }
}
