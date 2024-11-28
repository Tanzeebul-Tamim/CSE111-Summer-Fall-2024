package fall_24.assignments.assignment_3.graded_tasks.task1;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        System.out.println(acc1.printDetails());
        System.out.println("-----1-----");
        acc1.setInfo(1456890, "Salary");
        System.out.println("-----2-----");
        System.out.println(acc1.printDetails());
        System.out.println("-----3-----");
        BankAccount acc2 = new BankAccount();
        acc2.setInfo(1765498, "Student");
        System.out.println("-----4-----");
        System.out.println(acc2.printDetails());
    }
}
