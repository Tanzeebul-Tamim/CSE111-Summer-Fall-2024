package semesters_archives.summer_24.assignments.assignment_6.task5;

public class MobilePhone {
    private int capacity;
    private int contactCount;
    private String[][] contactList;

    public void setContactCapacity(int capacity) {
        this.capacity = capacity;
        this.contactList = new String[capacity][2];
    }

    public void details() {
        System.out.printf("Total Contacts: %d\n", this.contactCount);
        System.out.printf("Contact List:\n");

        if (contactCount > 0) {
            for (String[] contact : contactList) {
                System.out.printf("%s:%s\n", contact[0], contact[1]);
            }
        }
    }

    public void addContact(String name, int contactNo) {
        if (this.contactCount == this.capacity) {
            System.out.println("Storage Full!!");
        } else {
            this.contactList[contactCount][0] = name;
            this.contactList[contactCount++][1] = contactNo + "";

            System.out.printf("The contact of %s is added.\n", name);
        }
    }

    public void makeCall(int contactNo) {
        boolean found = false;

        for (String[] contact : contactList) {
            if (contact[1] != null && contact[1].equals(contactNo + "")) {
                System.out.printf("Calling %s . . .\n", contact[0]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.printf("Calling %d . . .\n", contactNo);
        }
    }
}
