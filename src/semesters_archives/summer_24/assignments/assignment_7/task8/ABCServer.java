package semesters_archives.summer_24.assignments.assignment_7.task8;

public class ABCServer {
    private String name;
    private int capacity;
    private int memberCount;
    private String[][] members;

    public ABCServer() {
        this("Default", 10);
    }

    public ABCServer(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.members = new String[this.capacity][2];
    }

    public void details() {
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

    public void addMembers(String name) {
        addMembers(name, "Rising Hero");
    }

    public void addMembers(String name, String role) {
        if (this.memberCount == this.capacity) {
            System.out.println("Sorry, maximum capacity exceeded!");
        } else {
            this.members[this.memberCount][0] = name;
            this.members[this.memberCount++][1] = role;

            System.out.printf("%s is added.\n", role);
        }
    }
}
