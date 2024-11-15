package fall_24.class_notes.lec_7.oop.task7;

public class Club {
    private String name;
    private double grossBudget;
    private int members;
    private int nonWorkingMembers;
    private Event[] events;
    private int eventCount;

    private class Event {
        private String name;
        private double budget;
        private int workingMembers;

        Event(String name, double budget, int workingMembers) {
            this.name = name;
            this.budget = budget;
            this.workingMembers = workingMembers;

            System.out.format("New event, \"%s\" has started!\n", this.name);

            if (this.budget < 1000) {
                System.out.format("%d members out of %d are now working.\n", this.workingMembers,
                        nonWorkingMembers);
            } else {
                System.out.format("%d out of %d available members are now working.\n", this.workingMembers,
                        nonWorkingMembers);
            }

            nonWorkingMembers -= this.workingMembers;
            grossBudget -= this.budget;
        }
    }

    public String approveClub(String name, int members, double grossBudget) {
        String output;

        if (members < 5) {
            output = "A club must have at least 5 members";
        } else {
            this.name = name;
            this.grossBudget = grossBudget;
            this.members = members;
            this.nonWorkingMembers = this.members;
            this.events = new Event[3];
            this.eventCount = 0;

            output = "New club, " + name + ", created with " + members + " members.";
        }

        return output;
    }

    public void info() {
        System.out.printf("Name of club: %s\n", this.name);
        System.out.printf("Non-working members: %d\n", this.nonWorkingMembers);
        System.out.printf("Current Budget: %.1f\n", this.grossBudget);

        if (eventCount == 0) {
            System.out.println("No events yet.");
        } else {
            System.out.printf("%d Events:\n", this.eventCount);

            int index = 0;
            for (Event event : this.events) {
                if (event != null) {
                    System.out.printf("%s:%d", event.name, event.workingMembers);

                    if (index < this.eventCount - 1) {
                        System.out.print(", ");
                    }
                }

                index++;
            }

            System.out.println();
        }
    }

    public void recruitMember(int members) {
        this.members += members;
        this.nonWorkingMembers += members;

        System.out.println("New members recruited");
        System.out.printf("Total non-working members now are %d.\n", this.nonWorkingMembers);
    }

    public void createEvent(String name, double budget, int members) {
        if (this.grossBudget < budget) {
            System.out.println("Not enough budget.");
            return;
        } else if (this.nonWorkingMembers < members) {
            int memberShortage = members - this.nonWorkingMembers;
            System.out.printf("Need %d more member(s) to arrange.\n", memberShortage);
            return;
        } else if (this.eventCount >= 3) {
            System.out.println("Cannot create more than 3 events at a time! End one or more first.");
            return;
        }

        Event event = new Event(name, budget, members);
        this.events[eventCount] = event;
        eventCount++;
    }

    public void endEvent(String name) {
        boolean matchFound = false;

        for (int i = 0; i < this.events.length; i++) {
            Event event = this.events[i];

            if (event != null && event.name.equals(name)) {
                this.nonWorkingMembers += event.workingMembers;
                System.out.printf("%s has ended!\n", event.name);
                System.out.printf("%d members are free now.\n", event.workingMembers);

                matchFound = true;
                eventCount--;

                for (int j = i; j < this.events.length - 1; j++) {
                    this.events[j] = this.events[j + 1];
                }

                this.events[this.events.length - 1] = null;

                return;
            }
        }

        if (!matchFound) {
            System.out.printf("No such event named '%s' exists!\n", name);
            return;
        }

    }
}
