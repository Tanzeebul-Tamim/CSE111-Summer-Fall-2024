package semesters_archives.fall_24.assignments.assignment_2.ungraded_tasks.task4;

public class MobilePhone {
    private int capacity;
    private int contactCount;
    private Contact[] contactList;

    private class Contact {
        private String name;
        private String contactNo;

        private Contact(String name, String contactNo) {
            this.name = name;
            this.contactNo = contactNo;
        }
    }

    public void setContactCapacity(int capacity) {
        this.capacity = capacity;
        this.contactList = new Contact[capacity];
    }

    public void details() {
        System.out.printf("Total Contacts: %d\n", this.contactCount);
        System.out.printf("Contact List:\n");

        if (contactCount > 0) {
            for (Contact contact : contactList) {
                if (contact != null)
                    System.out.printf("%s:%s\n", contact.name, contact.contactNo);
            }
        }
    }

    public void addContact(String name, int contactNo) {
        if (this.contactCount == this.capacity) {
            System.out.println("Storage Full!!");
        } else {
            Contact contact = new Contact(name, contactNo + "");
            this.contactList[this.contactCount++] = contact;

            System.out.printf("The contact of %s is added.\n", name);
        }
    }

    public void makeCall(int contactNo) {
        boolean found = false;

        for (Contact contact : contactList) {
            if (contact != null && contact.contactNo.equals(contactNo + "")) {
                System.out.printf("Calling %s . . .\n", contact.name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.printf("Calling %d . . .\n", contactNo);
        }
    }
}
