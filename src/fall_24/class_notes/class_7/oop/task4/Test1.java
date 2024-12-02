package fall_24.class_notes.class_7.oop.task4;

public class Test1 {
    public static void main(String[] args) {
        Account p1 = new Account();
        p1.setUp("Abdul", "Service Holder", 500000);
        p1.addMoney(300000);
        p1.printDetails();
        System.out.println("=========================");
        Account p2 = new Account();
        p2.setUp("Rahim", 700000);
        p2.withdrawMoney(700000);
        p2.printDetails();
        System.out.println("=========================");
        Account p3 = new Account();
        p3.setUp("Ashraf", "Govt. Officer", 200000);
        p3.withdrawMoney(250000);
        p3.printDetails();
        System.out.println("=========================");
    }
}
