package fall_24.assignments.assignment_2.graded_tasks.task7;

public class CellPhone {
    public String model;
    private String[] contacts;
    private int contactCount;

    CellPhone() {
        this.model = "unknown";
        this.contactCount = 0;
        this.contacts = new String[3];
    }

    void storeContact(String contact) {
        if (contactCount < 3) {
            this.contacts[this.contactCount] = contact;
            contactCount++;
            System.out.println("Contact Stored");
        } else {
            System.out.println("Memory full. New contact can't be stored.");
        }
    }

    void printDetails() {
        System.out.format("Phone Model %s\n", this.model);
        System.out.format("Contacts Stored %d\n", this.contactCount);

        if (contactCount > 0) {
            for (String contact : this.contacts) {
                if (contact != null) {
                    System.out.println(contact);
                }
            }
        }
    }
}
