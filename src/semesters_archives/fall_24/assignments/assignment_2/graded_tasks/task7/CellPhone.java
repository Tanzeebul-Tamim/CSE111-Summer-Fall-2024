package semesters_archives.fall_24.assignments.assignment_2.graded_tasks.task7;

public class CellPhone {
    public String model;
    private String[] contacts;
    private int contactCount;

    public CellPhone() {
        this.model = "unknown";
        this.contacts = new String[3];
    }

    public void storeContact(String contact) {
        if (contactCount < 3) {
            this.contacts[this.contactCount] = contact;
            contactCount++;
            System.out.println("Contact Stored");
        } else {
            System.out.println("Memory full. New contact can't be stored.");
        }
    }

    public void printDetails() {
        System.out.format("Phone Model %s\n", this.model);
        System.out.format("Contacts Stored %d\n", this.contactCount);

        if (contactCount > 0) {
            System.out.println("Stored Contacts:");
            for (String contact : this.contacts) {
                if (contact != null) {
                    System.out.println(contact);
                }
            }
        }
    }
}
