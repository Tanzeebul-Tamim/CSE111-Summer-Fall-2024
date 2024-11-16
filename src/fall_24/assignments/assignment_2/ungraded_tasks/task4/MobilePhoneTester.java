package fall_24.assignments.assignment_2.ungraded_tasks.task4;

public class MobilePhoneTester {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        MobilePhone m2 = new MobilePhone();
        m1.setContactCapacity(5);
        m2.setContactCapacity(100);
        m1.details();
        System.out.println("1----------------");
        m1.addContact("John", 9866);
        m1.addContact("Maria", 7865);
        System.out.println("2----------------");
        m1.details();
        System.out.println("3----------------");
        m1.makeCall(9866);
        System.out.println("4----------------");
        m1.addContact("Henry", 2365);
        System.out.println("5----------------");
        m1.makeCall(7552);
        m1.makeCall(2365);
        System.out.println("6----------------");
        m1.addContact("Gomes", 4589);
        m1.addContact("Antony", 8421);
        m1.addContact("Tony", 5789);
        System.out.println("7----------------");
        m1.details();
    }
}

/*
    Total Contacts: 0
    Contact List:
    1----------------
    The contact of John is added.
    The contact of Maria is added.
    2----------------
    Total Contacts: 2
    Contact List:
    John:9866
    Maria:7865
    3----------------
    Calling John . . .
    4----------------
    The contact of Henry is added.
    5----------------
    Calling 7552 . . .
    Calling Henry . . .
    6----------------
    The contact of Gomes is added.
    The contact of Antony is added.
    Storage Full!!
    7----------------
    Total Contacts: 5
    Contact List:
    John:9866
    Maria:7865
    Henry:2365
    Gomes:4589
    Antony:8421
 */